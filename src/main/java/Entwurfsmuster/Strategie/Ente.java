package Entwurfsmuster.Strategie;

public abstract class Ente {

    FlugVerhalten flugVerhalten;
    QuakVerhalten quakVerhalten;

    public Ente() {
    }

    public  void tuFliegen(){
        flugVerhalten.fliegen();
    }

    public void tuQuacken() {
        quakVerhalten.quaken();
    }

    public void schwimmen() {
        System.out.println("Alle Enten schwimmen, auch Holzenten!");
    }

    public void setFlugVerhalten(FlugVerhalten fv) {
        flugVerhalten = fv;
    }

    public void setQuakVerhalten(QuakVerhalten qv) {
        quakVerhalten = qv;
    }


}
