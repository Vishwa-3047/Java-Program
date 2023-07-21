public class thread {
    public static void main(String[] args) {
        Thread myThread = new Thread(> {
            try {

                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        myThread.start();

        while (true) {
            if (myThread.isAlive()) {
                System.out.println("Thread is still running.");
            } else {
                System.out.println("Thread has finished.");
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
