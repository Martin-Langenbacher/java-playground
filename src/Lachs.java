public class Lachs extends Fisch implements Kiemen {

    private String name;
    private int groesse;

    // Konstruktor


    public Lachs() {
        this.name = "Lachs";
        this.groesse = 5;
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



    @Override
    public void mitKiemenAtmen() {
        System.out.println("Ich atme mit meinen Kiemen!");
    }
}
