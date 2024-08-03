import java.util.Scanner;;

public class practical3_1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value in Pound");
            double pound = sc.nextDouble();

            double rupees = pound * 100;

            System.out.println("The value in Rupees is " + rupees + "Rs");
            System.out.println("\n\nThis Practical is made by 23CS046-Kathan Modh");

        }

    }

}
