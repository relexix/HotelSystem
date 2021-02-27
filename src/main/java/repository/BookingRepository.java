package repository;

import dbconnection.HibernateUtils;
import hotelsystem.tables.Booking;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

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

    public void updateBooking(Booking booking) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for updateBooking: ");

        if (bookingExists(booking)) {
            Transaction transaction = session.beginTransaction();

            // actual save into DB
            session.update(booking);

            // end transaction
            transaction.commit();

            session.close();
        } else {
            System.out.println("Booking was not found:" + booking);
        }
    }

    public boolean bookingExists(Booking booking) {
        return findById(booking.getBookingId()) != null;
    }

    public Booking findById(int id) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for findById()");

        Booking booking = session.find(Booking.class, id);

        session.close();

        System.out.println("Return " + booking);
        return booking;
    }

    public void deleteBooking(Booking booking) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for deleteBooking: ");

        if (bookingExists(booking)) {
            Transaction transaction = session.beginTransaction();

            // actual save into DB
            session.delete(booking);

            // end transaction
            transaction.commit();

            session.close();
        } else {
            System.out.println("Booking was not found:" + booking);
        }
    }

    public static void showBookingList() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        List allBooking = session.createSQLQuery("SELECT * FROM booking").list();
        System.out.println("TABLES: ");
        System.out.println(allBooking);
        System.out.println("TABLES SIZE: ");
        System.out.println(allBooking.size());
    }
}
