package classstructureio;

import java.util.Scanner;

public class registration {
    public static void main(String[] args) {
        System.out.println("What is your username?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("What is your e-mail adress?");
        String adress = scanner.nextLine();
        System.out.println("name: " + name+", adress:" +adress);

    }
}
