package repository;

import dbconnection.HibernateUtils;
import hotelsystem.tables.Room;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

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

    public static List<Room> findAllRooms() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for findAllRooms()");

        Query findAllQuery = session.createQuery("FROM Room");
        List<Room> roomList = findAllQuery.list();

        session.close();

        System.out.println("Rooms Avaible:  " + roomList.size());
        return roomList;
    }

    /// TODO fix this
    public static List<Room> roomsAvaible() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Query findAllQuery = session.createQuery("FROM Room");
        List<Room> roomList = findAllQuery.list();
        session.close();
        System.out.println("Rooms Avaible:  " + roomList.size());
        return roomList;
    }
}
