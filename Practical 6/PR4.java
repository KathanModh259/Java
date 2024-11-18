import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PR4 {
    public static void main(String[] args) {
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        try {
            copyFile(sourceFilePath, destinationFilePath);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
        System.out.println("\nThis practical is made by 23CS032-Kathan Kanabar");
    }

    public static void copyFile(String sourcePath, String destPath) throws IOException {
        FileInputStream inputStream = new FileInputStream(sourcePath);
        FileOutputStream outputStream = new FileOutputStream(destPath);

        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        inputStream.close();
        outputStream.close();
    }
}
