package session1;

public class MeinRunnable implements Runnable {


    @Override
    public void run() {
        System.out.println("2) Ich bin in run()");
        los();
        try {
            System.out.println("Ich schlafe jetzt gleich...");
            Thread.sleep(2000);
            System.out.println("Bin aufgewacht...");
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    private void los() {
        System.out.println("3) Ich bin in los()");
        tuNochMehr();
    }

    private void tuNochMehr() {
        System.out.println("4) Ich bin in tuNochMehr()");
        System.out.println("5) oben auf dem Stack");
    }


}
