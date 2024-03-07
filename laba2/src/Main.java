import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Лабораторная работа №2
* Выполнила бригада №4
* Задания 1.4*/
public class Main {
    /**
     * Вывод информации
     */
    public static void information (){
        System.out.println("""
                ----Информация----
                Фамилия разработчика: Лапин
                Дата и время получения задания: 12.02.2024 13:35:00
                Дата и время получения задания: 19.02.2024 13:35:00
                """);
    }
    public static void main(String[] args) {
        information();
        System.out.println("Задание 1.4");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int number = sc.nextInt(); // Количество чисел
        if (number > 0) {
            long[] array = new long[number]; // Массив с исходными числами
            int[] CountDigits = new int[number]; // Массив с количеством различных цифр
            for (int i = 0; i < number; i++) {
                System.out.print("Введите "+ i +" число: ");
                array[i] = sc.nextLong();
                CountDigits[i] = TaskOne.separateNumbers(array [i]); //Определенение количества различных цифр для каждого числа
            }
            System.out.println("Массив с количеством различных цифр у каждого числа " + Arrays.toString(CountDigits));
            int result = (int) array [TaskOne.searchMin(CountDigits, number)]; // Нахождение числа с минимальным количеством различных цифр
            System.out.println("Число с минимальным количеством различных чисел: " + result);
        }
        else {
            System.out.println("Вы ввели неверное количество чисел!");
        }



        System.out.println("\nЗадание 2.2");
        System.out.print("Введите количество чисел: ");
        int count = sc.nextInt();
        if (count > 0) {
            int[] array = new int[count];
            for (int i = 0; i < count; i++) {
                System.out.print("Введите " + i + " число: ");
                array[i] = sc.nextInt();
            }
            System.out.println("Вывод исходного массива: ");
            System.out.println(Arrays.toString(array));
            System.out.println("Вывод обратного массива: ");
            System.out.println(Arrays.toString(TaskTwo.BackPrint(array, count)));
        }
        else {
            System.out.println("Вы ввели неверное количество чисел!");
        }



        System.out.println("\n\nЗадание 3.3");
        System.out.print("Введите размерность матрицы: ");
        int size = sc.nextInt();
        if (size >= 0) {
            int[][] matrix = TaskThree.Matrix(size);
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println(TaskThree.searchMinMax(matrix));
        }
        else {
            System.out.println("Вы ввели неверный размер!");
        }
        scanner.close();
    }
}
