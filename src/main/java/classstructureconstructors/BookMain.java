package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book eeee = new Book ("Kosztolányi" , "cím");
        System.out.println(eeee.getAuthor());
        System.out.println(eeee.getTitle());

        eeee.register("ooooo");
        System.out.println(eeee.getAuthor());
        System.out.println(eeee.getTitle());
        System.out.println(eeee.getRegNumber());



    }
}
