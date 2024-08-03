import java.util.Arrays;;
public class practical2_6 {
    public static void main(String[] args) {
        String str = "hello i am kathan modh";
        System.out.println("The length of the string is " + str.length());
        System.out.println("The lowercase of the string is " + str.toLowerCase());
        System.out.println("The Uppercase of the string is " + str.toUpperCase());

        String revstr = "";
        for (int i = 0; i < str.length(); i++) {
            revstr = str.charAt(i) + revstr;
        }

        System.out.println("Reversed string: " + revstr);
        System.out.print("The Sorted String is::");

        char arrstr[]=str.toCharArray();
        Arrays.sort(arrstr);
        System.out.println(arrstr);

        System.out.println("\nThis practical is made by 23CS046-Kathan Modh");
    }
}

