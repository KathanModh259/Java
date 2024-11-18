public class prac7_4 {
    static int counter = 0;

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000); 
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    counter++;
                    System.out.println("Counter: " + counter);
                }
            }
        });
        t.start();
    }
}