import model.Country;
import org.hibernate.Session;
import util.HibernateUtil;

public class przyklad2 {
    public static void main(String[] args) {
        useMerge();
    }

    public static void usePersist() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country newCountry = new Country();
        newCountry.setName("India");
        newCountry.setAlias("IN");
        System.out.println("Przed Persist");
        session.persist(newCountry);
        System.out.println("Po persist");
        session.flush();
        System.out.println("Po Flush");
        session.getTransaction().commit();
        System.out.println("Po commit");
        session.close();
    }

    public static void useMerge() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Country newCountry = new Country();
        newCountry.setName("Spain");
        newCountry.setAlias("ES");
        session.merge(newCountry);
        session.flush();
        session.close();
    }
}
