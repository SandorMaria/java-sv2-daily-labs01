package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store raktar = new Store("csavar");
        Store valtozas = new Store("csavar");
        raktar.store (8);
        System.out.println(raktar.getStock());
        System.out.println(valtozas.getStock());
        valtozas.store (7);
        System.out.println(raktar.getStock());
        System.out.println(valtozas.getStock());


    }
}
