import model.*;
import org.hibernate.Session;
import util.HibernateUtil;
public class przyklad1 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Product address = session.find(Product.class, 3);
        session.close();
        System.out.println(address.toString());
    }
}
