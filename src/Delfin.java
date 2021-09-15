public class Delfin extends Fisch implements Saeugetier {

    private String name;
    private int groesse;

    // Konstruktor
    public Delfin(int groesse) {
        this.name = "Delfin";
        this.groesse = groesse;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public void schwimmen() {
        System.out.println("Ich schwimme immer zusammen mit meinen Freunden.");
    }

    public void holeLuft() {
        System.out.println("Ich habe oben eine 'Nase'!");
    }

}
