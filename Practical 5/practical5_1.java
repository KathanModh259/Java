import java.util.Scanner;

public class practical5_1 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        x = sc.nextInt();
        System.out.println("Enter the value of y:");
        y = sc.nextInt();
        try {
            z = x / y;
            System.out.println("The value of z is" + z);
        } catch (Exception e) {
            System.out.println("The error is " + e);
            System.out.println(e.getMessage());
        }
        System.out.println("\nThis practical is made by 23CS032-Kathan Kanabar");

    }

}
