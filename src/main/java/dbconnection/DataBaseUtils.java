package dbconnection;

import org.hibernate.Session;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DataBaseUtils {
    // credentials and connectivity configuration
    public static String DB_HOST = "localhost";// machine ip or localhost if the database is locally installed
    public static String DB_PORT = "3306";
    public static String DB_NAME = "hotelsystemdb";// or schema name

    public static String DB_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
    public static String DB_USER = "root";
    public static String DB_PASS = "java";

    public static void createTableBooking() {
        String ceateTableBooking = "CREATE TABLE `booking` (\n" +
                "  `bookingId` int(20) NOT NULL AUTO_INCREMENT,\n" +
                "  `checkin` date DEFAULT NULL,\n" +
                "  `checkout` date DEFAULT NULL,\n" +
                "  `paymentMethod` varchar(25) DEFAULT NULL,\n" +
                "  `totalPrice` int(10) DEFAULT NULL,\n" +
                "  `roomId` int(20),\n" +
                "  `clientId` int(20),\n" +
                "  `paymentId` int(20),\n" +
                "  PRIMARY KEY (`bookingId`),\n" +
                "   CONSTRAINT `fk_booking_room_id` FOREIGN KEY (roomId)\n" +
                "        REFERENCES room(roomId),\n" +
                "   CONSTRAINT `fk_booking_client_id` FOREIGN KEY (clientId)\n" +
                "        REFERENCES client(clientId),\n" +
                "   CONSTRAINT `fk_booking_payment_id` FOREIGN KEY (paymentId)\n" +
                "        REFERENCES payment(paymentId)\n" +
                ")";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            Statement statement = connection.createStatement();
            statement.execute(ceateTableBooking);
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void showTables() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        List allTables = session.createSQLQuery("SHOW TABLES").list();
        System.out.println("TABLES: ");
        System.out.println(allTables);
        System.out.println("TABLES SIZE: ");
        System.out.println(allTables.size());
    }

    public static void getConnection() throws SQLException {
        // create database connection
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        System.out.println("Connected to schema: " + connection.getCatalog());
    }

    public static void createTableRoom() {
        String ceateTableRoom = "CREATE TABLE `room` (\n" +
                "  `roomId` int(20) NOT NULL AUTO_INCREMENT,\n" +
                "  `number` int(20) DEFAULT NULL,\n" +
                "  `size` varchar(20) DEFAULT NULL,\n" +
                "  `beds` int(10) DEFAULT NULL,\n" +
                "  `price` int(10) DEFAULT NULL,\n" +
                "  PRIMARY KEY (`roomId`)\n" +
                ")";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            Statement statement = connection.createStatement();
            statement.execute(ceateTableRoom);
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void createTableClient() {
        String ceateTableClient = "CREATE TABLE `client` (\n" +
                "  `clientId` int(20) NOT NULL AUTO_INCREMENT,\n" +
                "  `firstName` varchar(20) DEFAULT NULL,\n" +
                "  `lastName` varchar(20) DEFAULT NULL,\n" +
                "  `age` int(2) DEFAULT NULL,\n" +
                "  `address` varchar(25) DEFAULT NULL,\n" +
                "  `phoneNumber` int(16) DEFAULT NULL,\n" +
                "  `eMailAddress` varchar(30) DEFAULT NULL,\n" +
                "  PRIMARY KEY (`clientId`)\n" +
                ")";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            Statement statement = connection.createStatement();
            statement.execute(ceateTableClient);
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void createTablePayment() {
        String ceateTablePayment = "CREATE TABLE `payment` (\n" +
                "  `paymentId` int(20) NOT NULL AUTO_INCREMENT,\n" +
                "  `method` varchar(20) DEFAULT NULL,\n" +
                "  PRIMARY KEY (`paymentId`)\n" +
                ")";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            Statement statement = connection.createStatement();
            statement.execute(ceateTablePayment);
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
