package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note siker = new Note();

        String topic = "programozás";
        siker.setTopic(topic);
        String name = "Péter";
        siker.setName(name);
        String text = "jó leszek";
        siker.setText(text);

        System.out.println(siker.getNoteText());
    }
}


