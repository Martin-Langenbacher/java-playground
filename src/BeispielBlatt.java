public class BeispielBlatt {
    private static int n = 0;
    private int wert;

    public BeispielBlatt(int wert) {
        n++;
        this.wert = wert;
    }

    public static  int anzahlObjekte(){
        return n;
    }

    public int getWert(){
        return wert;
    }

    public void setWert(int wert){
        this.wert = wert;
    }
    public void verdoppeln(){
        wert = wert * 2;
    }
}
