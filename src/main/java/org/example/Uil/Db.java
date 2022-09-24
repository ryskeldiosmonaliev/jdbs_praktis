package org.example.Uil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    private static final String url = "jdbc:postgresql://localhost:5432/jbs-practice";
    private static final String uzername = "postgres";
    private static final String password = "romaroma21roma";

    public static Connection connect(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url,uzername, password);
            System.out.println("Connected to db successfully");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }

}
