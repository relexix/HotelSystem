package repository;

import dbconnection.HibernateUtils;
import hotelsystem.tables.Payment;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class PaymentRepository {
    public void addPayment(Payment payment) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for addRoom: ");

        Transaction transaction = session.beginTransaction();

        // actual save into DB
        session.save(payment);

        // end transaction
        transaction.commit();

        session.close();
    }
}
