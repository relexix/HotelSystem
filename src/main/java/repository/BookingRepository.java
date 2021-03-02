package repository;

import dbconnection.HibernateUtils;
import hotelsystem.tables.Booking;
import hotelsystem.tables.Room;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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

    public static List<Booking> findAllBooking() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for findAllBooking()");

        Query findAllQuery = session.createQuery("FROM Booking");
        List<Booking> bookingList = findAllQuery.list();

        session.close();

        System.out.println("Booking List Size:  " + bookingList.size());
        return bookingList;
    }
}
