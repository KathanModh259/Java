
public class prac7_1_1 extends Thread {
    @Override
    public void run() {
        System.out.println("hello World");
    }

    public static void main(String[] args) {
        prac7_1_1 t = new prac7_1_1();
        t.start();

    }

}
