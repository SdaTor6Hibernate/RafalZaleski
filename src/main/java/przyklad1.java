import model.*;
import org.hibernate.Session;
import util.HibernateUtil;
public class przyklad1 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Order address = session.find(Order.class, 1);
        System.out.println(address.toString());
        session.close();

    }
}
