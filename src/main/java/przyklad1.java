import model.*;
import org.hibernate.Session;
import util.HibernateUtil;
public class przyklad1 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Address address = session.find(Address.class, 3);
        session.close();
        System.out.println(address.toString());
    }
}
