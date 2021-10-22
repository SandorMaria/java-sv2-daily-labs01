package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client prog = new Client();

        Scanner este = new Scanner(System.in);

        System.out.println("What is your name?");
        prog.name = este.nextLine();
        System.out.println("year");
        prog.year = este.nextInt();
        este.nextLine();
        System.out.println("adress");
        prog.address = este.nextLine();

        System.out.println("elso érték:" + prog.name ) ;
        System.out.println("második érték:" + prog.year ) ;
        System.out.println("harmadik érték:" + prog.address ) ;



    }
}
