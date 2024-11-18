import java.util.Random;

class NumberGenerator extends Thread {
    private Random random = new Random();
    private EvenHandler evenHandler;
    private OddHandler oddHandler;

    public NumberGenerator(EvenHandler evenHandler, OddHandler oddHandler) {
        this.evenHandler = evenHandler;
        this.oddHandler = oddHandler;
    }

    @Override
    public void run() {
        while (true) {
            int number = random.nextInt(100);
            System.out.println("Generated number: " + number);
            if (number % 2 == 0) {
                evenHandler.handle(number);
            } else {
                oddHandler.handle(number);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenHandler extends Thread {
    @Override
    public void run() {
    }

    public void handle(int number) {
        int square = number * number;
        System.out.println("Square of " + number + " is " + square);
    }
}

class OddHandler extends Thread {
    @Override
    public void run() {
    }

    public void handle(int number) {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is " + cube);
    }
}

public class MultiThreadApp {
    public static void main(String[] args) {
        EvenHandler evenHandler = new EvenHandler();
        OddHandler oddHandler = new OddHandler();
        NumberGenerator numberGenerator = new NumberGenerator(evenHandler, oddHandler);
        numberGenerator.start();
        evenHandler.start();
        oddHandler.start();
    }
}