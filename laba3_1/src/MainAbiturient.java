import java.util.*;

public class MainAbiturient {
    public static void main(String[] args) {
        System.out.print("------Меню------" +
                "\n1. Вывести абитуриентов с неудовлетворительными оценками" +
                "\n2. Вывести абитуриентов с суммой баллов выше заданной" +
                "\n3. Вывести N абитуриентов с самой высокой суммой баллов (вывод абитуриентов с полупроходной суммой)" +
                "\n\n Выбор действия: ");
        Scanner sc = new Scanner(System.in);
        int response = sc.nextInt();
        Abiturient[] abiturients = AbiturientArray.abiturients();
        switch (response) {
            case 1:
                Abiturient[] filterByLowMarks = ProcessingOfAbiturients.filterByLowMarks(abiturients);
                Arrays.stream(filterByLowMarks).forEach(System.out::println);
                break;
            case 2:
                System.out.print("Введите необходиму сумму баллов: ");
                int totalMark = sc.nextInt();
                if (totalMark > 0) {
                    Abiturient[] filterByTotalMarks = ProcessingOfAbiturients.filterByTotalMarks(abiturients, totalMark);
                    Arrays.stream(filterByTotalMarks).forEach(System.out::println);
                }
                else {
                    System.out.println("Вы ввели неверную сумму!");
                }
                break;

            case 3:
                System.out.print("Введите количество абитуриентов: ");
                int N = sc.nextInt();
                if (N > 0 && N < abiturients.length) {
                    Abiturient[] getTopNMarks = ProcessingOfAbiturients.getTopNMarks(abiturients, N);
                    Arrays.stream(getTopNMarks).forEach(System.out::println);
                }
                else {
                    System.out.println("Вы ввели неверное количество!");
                }
                    System.out.println("\n\nАбитуриенты с полупроходной суммой: ");
                    Abiturient[] getMiddleMarks = ProcessingOfAbiturients.getMiddleMarks(abiturients);
                    Arrays.stream(getMiddleMarks).forEach(System.out::println);
                break;
            default:
                System.out.println("Вы ввели неверный номер!");
                break;
        }
        scanner.close();
    }
}
