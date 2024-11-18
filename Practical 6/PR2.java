import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PR2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("ENTER THE CHARACTER FIRST");
            return;
        }
        String f_name = "dp.txt";
        char ch = args[0].charAt(0);
        int occurance = 0;
        try (BufferedReader r = new BufferedReader(new FileReader(f_name))) {
            int x;
            while ((x = r.read()) != -1) {
                if (x == ch) {
                    occurance++;
                }
            }
        } catch (IOException e) {
            System.out.println("THERE IS AN ERROR WHILE READING THE FILE" + e.getMessage());
        }
        System.out.println("The character '" + ch + "' appears " + occurance + " times in the file.");

        System.out.println("\nThis practical is made by 23CS032-Kathan Kanabar");
    }
}