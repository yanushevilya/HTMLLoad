package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;

public class Sqlitedb {
    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:atb_db.db");
            System.out.println("Connection");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}