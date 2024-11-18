
public class prac7_1_2 implements Runnable {

    
    @Override
    public void run() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {

        prac7_1_2 show = new prac7_1_2();
        Thread t = new Thread(show);
        t.start();
    }
}
