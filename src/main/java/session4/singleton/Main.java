package session4.singleton;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 4; i++) {

            //Thread.sleep(1000);
            System.out.println("Number: " + i);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Starting thread: " + Thread.currentThread());
                    UnsafeSingleton.getInstance();
                }
            }).start();
        }

    }
}
