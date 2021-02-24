package hotelsystem;

import dbconnection.DataBaseUtils;
import dbconnection.HibernateUtils;

import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        HibernateUtils.getSessionFactory();

    }
}
