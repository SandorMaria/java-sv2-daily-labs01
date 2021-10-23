package classstructuremethods;

import classstructureattributes.Song;

public class Client {
    private String name;
    private int year;
    private String address;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddres() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void migrate(String address) {
        this.address = address;
    }

}

