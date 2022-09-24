package org.example.Uil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatTabil{
    public static void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS people(" +
                "id INT PRIMARY KEY," +
                "name VARCHAR(50) NOT NULL," +
                "age INT," +
                "position VARCHAR(50) NOT NULL" +
                ");";
        try(Connection conn= Db.connect();
            Statement statement = conn.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("create table is succesfully");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public static void createCountry(){
        String sql = "CREATE TABLE IF NOT EXISTS country(" +
                "id INT PRIMARY KEY," +
                "name VARCHAR(50) NOT NULL UNIQUE," +
                "people_id INT REFERENCES people(id)" +
                ");";
        try(Connection conn= Db.connect();
            Statement statement = conn.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("create table is succesfully");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public static void createCity(){
        String sql = "CREATE TABLE IF NOT EXISTS cities(" +
                "    id INT PRIMARY KEY," +
                "    name VARCHAR(30) NOT NULL," +
                "    people_id INT REFERENCES people(id)," +
                "country_id int references country(id)" +
                ")";
        try(Connection conn= Db.connect();
            Statement statement = conn.createStatement()) {
            statement.executeUpdate(sql);
            System.out.println("create table is succesfully");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
