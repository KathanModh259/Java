import java.io.*;

public class PR5 {
    public static void main(String[] args) {
        // File paths
        String charFilePath = "charExample.txt";
        String byteFilePath = "byteExample.bin";
        String outputFilePath = "output.txt";

        // Character Stream Example
        try (FileWriter writer = new FileWriter(charFilePath);
                FileReader reader = new FileReader(charFilePath)) {
            writer.write("Character stream example.\n");
            int c;
            while ((c = reader.read()) != -1)
                System.out.print((char) c);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Byte Stream Example
        try (FileOutputStream out = new FileOutputStream(byteFilePath);
                FileInputStream in = new FileInputStream(byteFilePath)) {
            out.write("Byte stream example.\n".getBytes());
            int b;
            while ((b = in.read()) != -1)
                System.out.print((char) b);
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // BufferedReader/BufferedWriter Example
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFilePath))) {
            System.out.println("Enter text to write to the file (type 'exit' to finish):");
            String line;
            while (!(line = consoleReader.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(line);
                fileWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nThis practical is made by 23CS032-Kathan Kanabar");
    }
}
