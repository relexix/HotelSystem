package dbconnection;

public class DataBaseUtils {
    // credentials and connectivity configuration
    public static String DB_HOST = "localhost";// machine ip or localhost if the database is locally installed
    public static String DB_PORT = "3306";
    public static String DB_NAME = "hotelsystemdb";// or schema name

    public static String DB_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;
    public static String DB_USER = "root";
    public static String DB_PASS = "441100";
}
