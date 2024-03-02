import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Класс обработки массива объектов
 */
public class ProcessingOfAbiturients {
    static final int UNSATISFACTORYMARK = 2;
    /**
     * Фильтрация абитуриентов, имеющих неудовлетворительные оценки
     * @param abiturients - Массив Объектов Абитуриент
     * @return Массив объектов имеющие неудовлетворительные оценки
     * @autior Лапин Кирилл
     */
    public static Abiturient[] filterByLowMarks(Abiturient[] abiturients) {
        List<Abiturient> lowMarkList = new ArrayList<>();
        for (Abiturient abiturient : abiturients) {
            boolean hasLowMark = false;
            for (int mark : abiturient.getMark()) {
                if (mark == UNSATISFACTORYMARK) {
                    hasLowMark = true;
                    break;
                }
            }
            if (hasLowMark) {
                lowMarkList.add(abiturient);
            }
        }
        return lowMarkList.toArray(new Abiturient[0]);
    }

    /**
     * Фильтрации абитуриентов с суммой баллов выше заданной
     * @param abiturients - Массив объектов Абитуриент
     * @param minTotalMark - Минимальная заданная сумма оценок
     * @return Возвращает массив объектов, имеющих сумму оценок больше заданной
     */
    public static Abiturient[] filterByTotalMarks(Abiturient[] abiturients, int minTotalMark) {
        List<Abiturient> sumAboveTotalMark = new ArrayList<>();
        for (Abiturient abiturient : abiturients) {
            int sum = Arrays.stream(abiturient.getMark()).sum();
            if (sum > minTotalMark) {
                sumAboveTotalMark.add(abiturient);
            }
        }
        return sumAboveTotalMark.toArray(new Abiturient[0]);
    }

    /**
     * Выполняет сортировку пузырьком
     * @param abiturients - Массив объектов Абитуриент
     * @return - Возвращает отсортированный массив по убыванию суммы оценок
     */
    public static Abiturient[] sortedForMarks(Abiturient[] abiturients) {
        int length = abiturients.length;
        int firstSum, nextSum;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                firstSum = Arrays.stream(abiturients[j].getMark()).sum();
                nextSum = Arrays.stream(abiturients[j + 1].getMark()).sum();
                if (firstSum < nextSum) {
                    Abiturient temp = abiturients[j];
                    abiturients[j] = abiturients[j + 1];
                    abiturients[j + 1] = temp;
                }
            }
        }
        return abiturients;
    }

    /**
     * Выбор N абитуриентов с самой высокой суммой баллов
     * @param abiturients - Массив объектов Абитуриент
     * @param n - Количество абитуриентов, которые необходимо вывести
     * @return - Возвращает N абитуриентов с самыми высокими суммами баллов
     */
    public static Abiturient[] getTopNMarks(Abiturient[] abiturients, int n) {
        abiturients = Arrays.copyOfRange(sortedForMarks(abiturients), 0, n);
        return abiturients;
    }

    /**
     * Вывод абитуриентов, имеющих сумму оценок больше полусуммы
     * @param abiturients - Массив объектов Абитуриент
     * @return - Возвращает массив объектов Абитуриентов
     */
    public static Abiturient[] getMiddleMarks(Abiturient[] abiturients) {
        int n = 0;
        int nextSumMark;
        abiturients = sortedForMarks(abiturients);
        int middleSum = Arrays.stream(abiturients[0].getMark()).sum() / 2;
        for (Abiturient abiturient : abiturients) {
            nextSumMark = Arrays.stream(abiturient.getMark()).sum();
            if (nextSumMark > middleSum) {
                n++;
            }
        }
        abiturients = Arrays.copyOfRange(abiturients, 0, n);
        return abiturients;
    }
}
