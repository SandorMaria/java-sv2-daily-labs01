package classstructureio;

import java.awt.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Say two integers");
        Scanner scanner = new Scanner(System.in);
        int elso = scanner.nextInt();
        int masodik = scanner.nextInt();
        System.out.println(elso + " + " + masodik);
        System.out.println(elso + masodik);


    }
}
