package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song kedvenc = new Song();
        Scanner megoldom = new Scanner(System.in);

        System.out.println("Favourite band?");
        kedvenc.band = megoldom.nextLine();

        System.out.println("Favourite title?");
        kedvenc.title = megoldom.nextLine();


        System.out.println("Favorite lengthOfSong?");
        kedvenc.length = megoldom.nextInt();
        megoldom.nextLine();

        System.out.println(kedvenc.band  + " - " + kedvenc.title + " (" + kedvenc.length + " percben)" );

    }
}
