package hotelsystem;

import dbconnection.DataBaseUtils;
import dbconnection.HibernateUtils;
import hotelsystem.tables.Booking;
import hotelsystem.tables.Room;
import menu.MenuController;
import repository.BookingRepository;
import repository.RoomRepository;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        HibernateUtils.getSessionFactory();
        //Creating DataBase Tables
        //DataBaseUtils.createTableBooking();
        //DataBaseUtils.createTableRoom();
        //DataBaseUtils.createTableClient();
        // SHOW TABLES COMMAND + GET CONNECTION
//        DataBaseUtils.showTables();
//        DataBaseUtils.getConnection();
//
//        //CREATE BOOKING
//        Booking booking1 = new Booking(1, 22, 28, "cash", 200,1,1,1);
//        BookingRepository bookingRepository = new BookingRepository();
//        bookingRepository.addBooking(booking1);

//        //Create Client
//        Client client1 = new Client(1, "Alex", "Boitor", 30, "Baia Mare",
//                555662552, "alex.boitor90@gmail.com");
//        ClientRepository clientRepository = new ClientRepository();
//        clientRepository.addClient(client1);
//
//        //Create Room
//        Room room1 = new Room(1, 1, "small", 1, 200);
//        RoomRepository roomRepository = new RoomRepository();
//        roomRepository.addRoom(room1);

        //SHOW BOOKING LIST // TODO FINISH THIS
//        BookingRepository.findAll();
//
        MenuController menuController = new MenuController();
        menuController.start();

//        List<Booking> bookingList = BookingRepository.findAllBooking();
//        System.out.println(bookingList);

//        List<Room> roomList = RoomRepository.findAllRooms();
//        System.out.println(roomList);


    }
}
