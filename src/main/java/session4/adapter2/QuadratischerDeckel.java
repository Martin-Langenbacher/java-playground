package session4.adapter2;

public class QuadratischerDeckel {

    private double breite;

    public QuadratischerDeckel(double breite) {
        this.breite = breite;
    }


    public double getBreite() {
        return breite;
    }

    public double getQuadrat() {
        double result;
        result = Math.pow(this.breite, 2);
        return result;
    }
}
