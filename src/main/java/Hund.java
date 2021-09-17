public class Hund {

    private String name;
    private int groesse;
    private int minimaleGroesse = 5;

    // Konstruktor
    public Hund(String name, int groesse) {
        this.name = name;
        this.groesse = groesse;
    }

    public Hund(String name) {
        this.name = name;
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
        if (groesse < minimaleGroesse ) {
            this.groesse = minimaleGroesse;
            System.out.println("Ich habe die Größe auf " + minimaleGroesse + " geändert!");
        } else {
            this.groesse = groesse;
        }
    }

    // Methoden
    public void bewegen(){
        System.out.println(this.name + ": Ich renne hinter einem Knochen her!");
    }

    public void bellen() {
        if (groesse > 60) {
            System.out.println("Wuff! Wuff!");
        } else if (groesse >14 ) {
            System.out.println("Wau! Wau!");
        } else {
            System.out.println("Jip! Jip!");
        }

    }
}
