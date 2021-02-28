package repository;

import dbconnection.HibernateUtils;
import hotelsystem.tables.Booking;
import hotelsystem.tables.Client;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientRepository {

    public void addClient(Client client) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for addClient: ");

        Transaction transaction = session.beginTransaction();
        // Test branch 2
        // actual save into DB
        session.save(client);

        // end transaction
        transaction.commit();

        session.close();
    }
}
