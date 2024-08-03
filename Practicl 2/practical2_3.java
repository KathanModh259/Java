import java.util.Scanner;

public class practical2_3 {
    public static void main(String[] args) {
        int x = 0;
        System.out.println("Enter array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the numbers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            if (arr[i] == 9) {
                x = 1;
                break;
            }

        }
        if (x == 1) {

            System.out.print("True");
        } else {

            System.out.print("False");
        }
        System.out.println("\nThis practical is made by 23CS046-Kathan Modh");
        sc.close();

    }
}