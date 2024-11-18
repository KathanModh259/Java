
public class practical5_3 {
    public static void main(String[] args) {
        practical5_3 obj = new practical5_3();
        try {
            obj.create_exception();
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        obj.checkAge(10);
        System.out.println("\nThis practical is made by 23CS032-Kathan Kanabar");

    }

    int create_exception() throws ArithmeticException {
        int x = 10 / 0;
        return x;
    }

    public void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible for vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}
