package hotelsystem;

import dbconnection.DataBaseUtils;
import dbconnection.HibernateUtils;
import hotelsystem.tables.Booking;
import hotelsystem.tables.Client;
import hotelsystem.tables.Payment;
import hotelsystem.tables.Room;
import repository.BookingRepository;
import repository.ClientRepository;
import repository.PaymentRepository;
import repository.RoomRepository;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        HibernateUtils.getSessionFactory();
//        Creating DataBase Tables
//        DataBaseUtils.createTableBooking();
//        DataBaseUtils.createTableRoom();
//        DataBaseUtils.createTableClient();
//        DataBaseUtils.createTablePayment();
//        SHOW TABLES COMMAND + GET CONNECTION
//        DataBaseUtils.showTables();
//        DataBaseUtils.getConnection();


//        //Create Client
//        Client client2 = new Client( "Aurelia", "Tache", 37, "Bucuresti",722405830, "aurelia.tache@yahoo.com");
//        ClientRepository clientRepository = new ClientRepository();
//        clientRepository.addClient(client2);
//
//        //Create Room
//        Room room2 = new Room( 2, "small", 2, 250);
//        RoomRepository roomRepository = new RoomRepository();
//        roomRepository.addRoom(room2);
//
//        // CREATE PAYMENT
//        Payment payment1 = new Payment("Cash");
//        PaymentRepository paymentRepository = new PaymentRepository();
//        paymentRepository.addPayment(payment1);
//
//         // CREATE BOOKING
//        Booking booking1 = new Booking( LocalDate.of(2021,03, 10), LocalDate.of(2021,04, 17), "cash", 200,client2, room2, payment1);
//        BookingRepository bookingRepository = new BookingRepository();
//        bookingRepository.addBooking(booking1);

        //SHOW BOOKING LIST
        BookingRepository.showBookingList();
    }
}
