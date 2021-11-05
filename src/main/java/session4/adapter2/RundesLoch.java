package session4.adapter2;


/**
 * RundesLoch ist compatibel zu RunderDeckel.
 */
public class RundesLoch {
    private double radius;

    public RundesLoch(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RunderDeckel runderDeckel) {
        boolean result;
        result = (this.getRadius() >= runderDeckel.getRadius());
        return result;
    }
}

