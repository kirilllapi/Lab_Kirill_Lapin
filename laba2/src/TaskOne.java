import java.util.Arrays;
import java.util.Scanner;
// Найти число, в котором число различных цифр минимально. Если таких чисел несколько, найти первое из них.
/**
 * Код первого задания
 */
public class TaskOne {
    /**
     *
     * @param numbers Одно из исходных чисел
     * @return Возвращает количество различных цифр в числе
     */
     static int separateNumbers (long numbers) {
         if (numbers < 0) numbers *= -1;
         int count = 0; //
         boolean[] digits = new boolean[10]; // Массив для проверки цифр
         while (numbers != 0) {
             long digit = numbers % 10;
             if (!digits[(int) digit]) {
                 digits[(int) digit] = true;
                 count++;
             }
             numbers /= 10;
         }

         return count;
     }
    /**
     *
     * @param CountDigits Массив с количеством различных цифр для каждого числа
     * @param number Количество введенных чисел
     * @return Возвращает индекс числа в массиве исходных чисел, у которого минимальное количество различных цифр
     */
     static int searchMin (int[] CountDigits, int number) {
         int min = CountDigits[0];
         int index = 0;
         for (int i = 0; i < number; i++) {
             if (CountDigits[i] < min) {
                 index = i;
                 min = CountDigits[i];
             }
         }
         return index;
     }
}
