package session4.adapter2;

/**
 * Adapter allows fitting square pegs into round holes.
 */
public class QuadratischerDeckelAdapter extends RunderDeckel {

    private QuadratischerDeckel deckel;

    public QuadratischerDeckelAdapter(QuadratischerDeckel deckel) {
        this.deckel = deckel;
    }

    @Override
    public double getRadius() {
        double result;
        // Berechne einen minimalen Radius, in dem der Deckel passen würde:
        result = (Math.sqrt(Math.pow((deckel.getBreite() / 2), 2) * 2));
        return result;
    }
}
