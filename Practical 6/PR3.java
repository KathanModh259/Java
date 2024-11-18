import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PR3 {
    public static void main(String[] args) {

        String filePath = "dp.txt"; // Change this to your file path
        String wordToSearch = "Java";

        try {
            searchWordInFile(filePath, wordToSearch);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        demonstrateWrapperClasses();
        System.out.println("\nThis practical is made by 23CS032-Kathan Kanabar");
    }

    public static void searchWordInFile(String filePath, String word) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        int lineNumber = 0;
        boolean found = false;

        while ((line = reader.readLine()) != null) {
            lineNumber++;
            if (line.contains(word)) {
                System.out.println("Word found at line " + lineNumber + ": " + line);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Word not found in the file.");
        }

        reader.close();
    }

    public static void demonstrateWrapperClasses() {
        // Primitive data types
        int primitiveInt = 10;
        double primitiveDouble = 20.5;

        Integer wrapperInt = Integer.valueOf(primitiveInt);
        Double wrapperDouble = Double.valueOf(primitiveDouble);

        int unboxedInt = wrapperInt.intValue();
        double unboxedDouble = wrapperDouble.doubleValue();

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Unboxed int: " + unboxedInt);

        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Wrapper Double: " + wrapperDouble);
        System.out.println("Unboxed double: " + unboxedDouble);

        Integer autoBoxedInt = primitiveInt; // Autoboxing
        int autoUnboxedInt = autoBoxedInt; // Unboxing

        System.out.println("Autoboxed Integer: " + autoBoxedInt);
        System.out.println("Auto-unboxed int: " + autoUnboxedInt);
    }
}
