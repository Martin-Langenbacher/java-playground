public class StringObject {

    // Ich will eine ArrayList mit 1) String + 2) boolean (für Zahl - oder nicht)
    private String string;
    private boolean toCheckIfNumber;


    // Konstruktor
    public StringObject(String string, boolean toCheckIfNumber) {
        this.string = string;
        this.toCheckIfNumber = toCheckIfNumber;
    }


    // Getter
    public String getString() {
        return string;
    }

    public boolean isToCheckIfNumber() {
        return toCheckIfNumber;
    }
}
