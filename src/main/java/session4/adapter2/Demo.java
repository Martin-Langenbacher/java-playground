package session4.adapter2;

/**
 * Somewhere in client code...
 */
public class Demo {
    public static void main(String[] args) {
        // Rund fits rund, keine Überraschung !!!
        RundesLoch loch = new RundesLoch(5);
        RunderDeckel runderDeckel = new RunderDeckel(5);

        /*RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if (hole.fits(rpeg)){
            System.out.println("asdfasdfasdfasdfa");
        }

         */


        if (loch.fits(runderDeckel)) {
            System.out.println("Runder Deckel r5 passt in rundes Loch r5.");
        }

        QuadratischerDeckel kleinerQuadratischerDeckel = new QuadratischerDeckel(2);
        QuadratischerDeckel grosserQuadratischerDeckel = new QuadratischerDeckel(20);
        // loch.fits(kleinerQuadratischerDeckel); // Won't compile !

        // Adapter wird das Problem lösen:
        QuadratischerDeckelAdapter kleinerQuadratischerDeckelAdapter = new QuadratischerDeckelAdapter(kleinerQuadratischerDeckel);
        QuadratischerDeckelAdapter grosserQuadratischerDeckelAdapter = new QuadratischerDeckelAdapter(grosserQuadratischerDeckel);

        if (loch.fits(kleinerQuadratischerDeckelAdapter)) {
            System.out.println("Runder Deckel w2 passt in das runde Loch r5.");
        }

        if (!loch.fits(grosserQuadratischerDeckelAdapter)) {
            System.out.println("Runder Deckel w20 passt NICHT in das runde Loch r5.");
        }

    }
}
