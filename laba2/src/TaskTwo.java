import java.util.Scanner;
/**
 * Код второго задания
 */
public class TaskTwo {
    /**
     * Метод разворачивающий элементы массива
     */
    static int[] BackPrint(int[] array, int count) {
        int[] BackArray = new int[array.length];
        for (int i = 0; i < count; i++) {
            BackArray[i] = array[count - 1 - i];
        }
        return BackArray;
    }
}
