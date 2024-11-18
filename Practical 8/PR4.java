import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class PR4 {

    private static final Set<String> keywords = new HashSet<>();

    static {
        String[] javaKeywords = {
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float",
                "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp",
                "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile",
                "while", "true", "false"
        };
        for (String keyword : javaKeywords) {
            keywords.add(keyword);
        }
    }

    public static int countKeywords(String filePath) {
        int keywordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, " \t\n\r\f,;(){}[]<>+-/*=.!@#$%^&|~`\"\'");
                while (tokenizer.hasMoreTokens()) {
                    String word = tokenizer.nextToken();
                    // Check if the word is a keyword
                    if (keywords.contains(word)) {
                        keywordCount++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return keywordCount;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PR4 <JavaSourceFile>");
            return;
        }

        String filePath = args[0];
        int keywordCount = countKeywords(filePath);
        System.out.println("Number of Java keywords in file: " + keywordCount);
        System.out.println("\nThis Practical is made by 23CS032-Kathan Kanabar");
    }
}
