import java.util.Scanner;

public class practical2_4

{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        char[] name = sc.next().toCharArray();
        int n = name.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(name[i]);
            }

        }
        System.out.println("This practical is made by 23CS046-Kathan Modh");
        sc.close();

    }
}
