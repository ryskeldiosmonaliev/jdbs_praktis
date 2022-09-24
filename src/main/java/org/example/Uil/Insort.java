package org.example.Uil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Insort {
    public static void insertTAblePeople(int id, String name, int age, String position) {
        String sql = "INSERT INTO people(id,name,age,position) VALUES(?,?,?,?)";
        try (Connection connection = Db.connect();
             PreparedStatement prep = connection.prepareStatement(sql);) {
            prep.setInt(1, id);
            prep.setString(2, name);
            prep.setInt(3, age);
            prep.setString(4, position);
            prep.executeUpdate();
            System.out.println(name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertTableCountries(int id,String name,int people_id) {
        String sql = "INSERT INTO  country(id, name, people_id) VALUES(?,?,?)";
        try (Connection connection = Db.connect();
             PreparedStatement prer = connection.prepareStatement(sql)) {
            prer.setInt(1,id);
            prer.setString(2,name);
            prer.setInt(3,people_id);
            prer.executeUpdate();
            System.out.println("ушпешно add " + name);
        } catch (SQLException e) {
            System.out.println("не ушпешно" + e.getMessage());
        }
    }
    public static void insertTablecities(int id,String name,int people_id,int country_id ){
        String sql = "INSERT INTO cities(id, name, people_id, country_id)VALUES (?,?,?,?)";
        try(Connection connection = Db.connect();
        PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1,id);
            statement.setString(2,name);
            statement.setInt(3,people_id);
            statement.setInt(4,country_id);
            statement.executeUpdate();
            System.out.println("correct "+ name);
        }catch (SQLException e){
            System.out.println("no corect"+e.getMessage());
        }
    }
}
