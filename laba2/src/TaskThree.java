import java.util.Random;

/**
 * Объект результата нахождения максимального числа возрастающих/убываюших элементов
 */
class MyResult {
    private int first;
    private int second;

    public MyResult(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Максимальное число возрастающих элементов в строках: " + first + "\n" +
                "Минимальное число возрастающих элементов в строках:" + second;
    }
}

/**
 * Код третьего задания
 */
//Найти и вывести наибольшее число возрастающих\убывающих элементов матрицы, идущих подряд.
public class TaskThree {
    /**
     * Создает рандомную матрицу
     * @return Возвращает сгенерированную матрицу
     */
    public static int[][] Matrix(int size) {
        Random rand = new Random();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt(100);
            }
        }
        return matrix;
    }
    /**
     * Метод находящий максимальное число возрастающих/убываюших элементов в строке
     */
    public static MyResult searchMinMax(int[][] array) {
        int maxIncreasing = 0;
        int maxDecreasing = 0;
        for (int i = 0; i < array.length; i++) {
            int countIncreasing = 1; // Обнуление счетчика на каждой строке
            int countDecreasing = 1;
            for (int j = 1; j < array[0].length; j++) { // Счетчик возрастающих элементов
                if (array[i][j] > array[i][j - 1]) {
                    countIncreasing++;
                    countDecreasing = 1;
                } else if (array[i][j] < array[i][j - 1]) { // Счетчик убывающих элементов
                    countDecreasing++;
                    countIncreasing = 1;
                } else {
                    countIncreasing = 1; // Обнуление счетчика
                    countDecreasing = 1;
                }
                // Нахождение максимального числа возрастающих/убываюших элементов
                maxIncreasing = Math.max(maxIncreasing, countIncreasing);
                maxDecreasing = Math.max(maxDecreasing, countDecreasing);
            }
        }
        return new MyResult(maxIncreasing, maxDecreasing);
    }
}

