import java.util.Scanner;

public class practical2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        sc.close();

        String s = " ";
        String arr[] = str.split(s);
        int a = arr.length;
        String result = "";

        for (int i = 0; i < a; i++) {
            String stored = "";
            result = "";
            stored = arr[i];
            for (int j = 0; j < stored.length(); j++) {
                result = stored.charAt(j) + result;
            }
            System.out.print(result + " ");
        }
        System.out.println(" This Practical is made by 23CS046-Kathan Modh");
    }
}