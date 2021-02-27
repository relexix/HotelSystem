package repository;

import dbconnection.HibernateUtils;
import hotelsystem.tables.Client;
import hotelsystem.tables.Room;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RoomRepository {

    public void addRoom(Room room) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for addRoom: ");

        Transaction transaction = session.beginTransaction();

        // actual save into DB
        session.save(room);

        // end transaction
        transaction.commit();

        session.close();
    }
}
