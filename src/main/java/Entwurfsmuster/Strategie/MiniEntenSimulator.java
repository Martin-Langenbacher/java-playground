package Entwurfsmuster.Strategie;

public class MiniEntenSimulator {

    public static void main(String[] args) {
        Ente mallard = new StockEnte();
        mallard.tuQuacken();
        mallard.tuFliegen();

        Ente modell = new ModellEnte();
        modell.tuFliegen();
        modell.setFlugVerhalten(new FliegtRaketenGetrieben());
        modell.tuFliegen();

    }
}
