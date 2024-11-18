import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PR1 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No files specified.");
            return;
        }

        for (String F_name : args) {
            try {
                int lineCount = countLines(F_name);
                System.out.println(F_name + ": " + lineCount + " lines");
            } catch (IOException e) {
                System.err.println("Error in reading file " + F_name + ": " + e.getMessage());
            }
        }
        System.out.println("\nThis practical is made by 23CS032-Kathan Kanabar");
    }

    private static int countLines(String fileName) throws IOException {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                lines++;
            }
        }
        return lines;
    }
}