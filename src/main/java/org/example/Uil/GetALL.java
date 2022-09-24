package org.example.Uil;

import org.example.Model.City;
import org.example.Model.Country;
import org.example.Model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class GetALL {
    public static List<Person> getAllPeople() {
        String sql = "SELECT * FROM  people";
        List<Person> people = new ArrayList<>();
        try (Connection connect = Db.connect();
             Statement statement = connect.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Person person = new Person();
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String position = resultSet.getString("position");
                person.setId(id);
                person.setName(name);
                person.setAge(age);
                person.setPosition(position);
                people.add(person);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return people;
    }

    public static List<Country> getAllCountry() {
        String sql = "SELECT * FROM country";
        List<Country> countries = new ArrayList<>();
        try (Connection conn = Db.connect();
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Country country = new Country();
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int people_id = resultSet.getInt("people_id");
                country.setId(id);
                country.setName(name);
                country.setPeopleId(people_id);
                countries.add(country);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return countries;
    }

    public static List<City> getAllCity() {
        String sql = "SELECT * FROM cities";
        List<City> cities = new ArrayList<>();
        try (Connection conn = Db.connect();
             Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                City city = new City();
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int people_id = resultSet.getInt("people_id");
                int country_id = resultSet.getInt("country_id");
                city.setId(id);
                city.setName(name);
                city.setPeopleID(people_id);
                city.setCountryID(country_id);
                cities.add(city);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cities;
    }


    public static void getById() {
        String sql = "SELECT * FROM cities  WHERE id =6";//5 бишкек 6 берлин 7 марид
        try (Connection connection = Db.connect();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int people_id = resultSet.getInt("people_id");
                int country_id = resultSet.getInt("country_id");
                System.out.println(id + " " + name + " " + people_id + " " + country_id);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
