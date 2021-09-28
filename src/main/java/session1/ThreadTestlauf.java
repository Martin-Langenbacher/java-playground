package session1;

public class ThreadTestlauf {

    public static void main(String[] args) {
        Runnable threadJob = new MeinRunnable();
        Thread meinThread = new Thread(threadJob);

        meinThread.start();
        System.out.println("1) zurück zur main");
        System.out.println("1) ========> Warum kommt 'zurück zur main als erstes - und nicht als letztes?");
    }
}
