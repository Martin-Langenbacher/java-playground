public class Wal extends Fisch implements Saeugetier {

    private String name;
    private int groesse;

    // Konstruktor
    public Wal(String name, int groesse) {
        super();
        this.name = name;
        this.groesse = groesse;
        System.out.println("===================>>> Ich bin im Konstruktor von Wal... !");
        // Bessere IDEE ???????????????????????????????????????????????????????????????????????????
        //Fisch.setN(Fisch.getN()+1);
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
    public void holeLuft() {
        System.out.println("Ich hole Luft.");
    }

    public void ichSpringe() {
        System.out.println("Wale springen nicht!");
    }

}
