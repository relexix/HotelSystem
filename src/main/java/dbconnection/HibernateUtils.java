package dbconnection;

import hotelsystem.tables.Booking;
import hotelsystem.tables.Client;
import hotelsystem.tables.Room;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import java.util.Properties;

import static dbconnection.DataBaseUtils.*;

public class HibernateUtils {
    // singleton
    // heavy usage
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();

            Properties settings = new Properties();
            settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
            settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

            settings.put(Environment.URL, DB_URL);
            settings.put(Environment.USER, DB_USER);
            settings.put(Environment.PASS, DB_PASS);

            settings.put(Environment.SHOW_SQL, "true");

            configuration.setProperties(settings);

            // TODO Add classes for hibernate to know what
            configuration.addAnnotatedClass(Booking.class);
            configuration.addAnnotatedClass(Client.class);
            configuration.addAnnotatedClass(Room.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory();
        }

        return sessionFactory;
    }
}
