package Entwurfsmuster.Strategie;

public class StockEnte extends Ente {

    public StockEnte () {
        quakVerhalten = new Quaken();
        flugVerhalten = new FliegtMitFlügeln();
    }

    public void anzeigen(){
        System.out.println("Ich bin eine echte Stockente");
    }
}
