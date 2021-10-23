package classstructuremethods;

public class Note {
    private String name;
    private String topic;
    private String text;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNoteText() {
        return getName() + ": (" + getTopic() + ") " + getText();
    }
}