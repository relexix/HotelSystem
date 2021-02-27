package repository;

import dbconnection.HibernateUtils;
import hotelsystem.tables.Booking;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookingRepository {

    public void addBooking(Booking booking) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for addBooking: ");

        Transaction transaction = session.beginTransaction();

        // actual save into DB
        session.save(booking);

        // end transaction
        transaction.commit();

        session.close();
    }
}
