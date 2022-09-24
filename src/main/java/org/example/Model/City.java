package org.example.Model;

public class City {
    private int id;
    private String name;
private int peopleID;
private int countryID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeopleID() {
        return peopleID;
    }

    public void setPeopleID(int peopleID) {
        this.peopleID = peopleID;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", peopleID=" + peopleID +
                ", countryID=" + countryID +
                '}';
    }
}
