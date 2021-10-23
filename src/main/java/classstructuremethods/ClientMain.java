package classstructuremethods;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client happy = new Client();

        String address = "Paks";
        happy.setAddress(address);
        String name = "Ede";
        happy.setName(name);
        int ojkjkljlkjklmkljkl= 1970;
        happy.setYear(ojkjkljlkjklmkljkl);
        //////////////
        System.out.println(happy.getName());
        System.out.println((happy.getAddres()));
        System.out.println(happy.getYear());
        happy.migrate("Ózd");
        System.out.println("Új címként mentve: " + happy.getAddres());
    }
}
