public class Ente {

    private String name;

    public void bewegen(){
        System.out.println("Ich schwimme!");
    }

    public String gibGeheinis(){
        return "Das ist mein Geheimnis!";
    }


    // Konstruktor


    public Ente(String name) {
        this.name = name;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
