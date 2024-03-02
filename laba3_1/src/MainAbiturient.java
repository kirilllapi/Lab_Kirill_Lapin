import java.util.*;

public class MainAbiturient {
    public static void main(String[] args) {
        System.out.print("------Меню------" +
                "\n1. Вывести абитуриентов с неудовлетворительными оценками" +
                "\n2. Вывести абитуриентов с суммой баллов выше заданной" +
                "\n3. Вывести N абитуриентов с самой высокой суммой баллов (вывод абитуриентов с полупроходной суммой)" +
                "\n\n Выбор действия: ");
        Scanner sc = new Scanner(System.in);
        MenuBar choice;
        try {
            int userInput = sc.nextInt();
            choice = MenuBar.values()[userInput - 1];

        } catch (Exception e) {
            choice = MenuBar.EXIT;
        }

        Abiturient[] abiturients = AbiturientArray.abiturients();
        switch (choice) {
            case UNSATISFACTORY:
                PrintUnsatisfactory(abiturients);
                break;
            case ABOVE:
                System.out.print("Введите необходиму сумму баллов: ");
                int totalMark = sc.nextInt();
                if (totalMark > 0) {
                    PrintAboveSum(abiturients, totalMark);
                } else {
                    System.out.println("Вы ввели неверную сумму!");
                }
                break;

            case TOP:
                System.out.print("Введите количество абитуриентов: ");
                int N = sc.nextInt();
                if (N > 0 && N < abiturients.length) {
                    PrintTopMark(abiturients, N);
                } else {
                    System.out.println("Вы ввели неверное количество!");
                }
                System.out.println("\n\nАбитуриенты с полупроходной суммой: ");
                PrintMiddleMark(abiturients);
                break;
            case EXIT:
                System.out.println("Вы ввели неверный номер!");
                break;
        }
        sc.close();
    }

    /**
     * Вывод абитуриентов с неудовлетворительными оценками
     * @param abiturients - Исходный массив Абитуриентов
     */
    public static void PrintUnsatisfactory(Abiturient[] abiturients){
        Abiturient[] filterByLowMarks = ProcessingOfAbiturients.filterByLowMarks(abiturients);
        Arrays.stream(filterByLowMarks).forEach(System.out::println);
    }

    /**
     * Вывод абитуриентов с суммой баллов выше заданной
     * @param abiturients - Исходный массив Абитуриентов
     * @param totalMark - Минимальная сумма баллов
     */
    public static void PrintAboveSum(Abiturient[] abiturients, int totalMark){
        Abiturient[] filterByTotalMarks = ProcessingOfAbiturients.filterByTotalMarks(abiturients, totalMark);
        Arrays.stream(filterByTotalMarks).forEach(System.out::println);
    }

    /**
     * Вывод N абитуриентов с самой высокой суммой баллов
     * @param abiturients - Исходный массив Абитуриентов
     * @param N - Количество абитуриентов
     */
    public static void PrintTopMark(Abiturient[] abiturients, int N){
        Abiturient[] getTopNMarks = ProcessingOfAbiturients.getTopNMarks(abiturients, N);
        Arrays.stream(getTopNMarks).forEach(System.out::println);
    }

    /**
     * Вывод абитуриентов с полупроходной суммой
     * @param abiturients - Исходный массив Абитуриентов
     */
    public static void PrintMiddleMark(Abiturient[] abiturients){
        Abiturient[] getMiddleMarks = ProcessingOfAbiturients.getMiddleMarks(abiturients);
        Arrays.stream(getMiddleMarks).forEach(System.out::println);
    }

}
