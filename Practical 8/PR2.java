import java.util.Arrays;

public class PR2 {

    public static <T extends Comparable<T>> void sortArray(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = { 5, 3, 8, 1, 4 };
        System.out.println("Before sorting (Integer array): " + Arrays.toString(intArray));
        sortArray(intArray);
        System.out.println("After sorting (Integer array): " + Arrays.toString(intArray));

        String[] stringArray = { "banana", "apple", "cherry", "date" };
        System.out.println("\nBefore sorting (String array): " + Arrays.toString(stringArray));
        sortArray(stringArray);
        System.out.println("After sorting (String array): " + Arrays.toString(stringArray));
        System.out.println("\nThis Practical is made by 23CS032-Kathan Kanabar");
    }
}
