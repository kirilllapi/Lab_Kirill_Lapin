import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcessingOfAbiturients {
    public static Abiturient[] filterByLowMarks(Abiturient[] abiturients) {
        // Логика для фильтрации абитуриентов с неудовлетворительными оценками
        List<Abiturient> lowMarkList = new ArrayList<>();
        for (Abiturient abiturient : abiturients) {
            boolean hasLowMark = false;
            for (int mark : abiturient.getMark()) {
                if (mark == 2) {
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

    public static Abiturient[] filterByTotalMarks(Abiturient[] abiturients, int minTotalMark) {
        // Логика для фильтрации абитуриентов с суммой баллов выше заданной
        List<Abiturient> SumAboveTotalMark = new ArrayList<>();
        for (Abiturient abiturient : abiturients) {
            int sum = Arrays.stream(abiturient.getMark()).sum();
            if (sum > minTotalMark) {
                SumAboveTotalMark.add(abiturient);
            }
        }
        return SumAboveTotalMark.toArray(new Abiturient[0]);
    }

    public static Abiturient[] sortedForMarks(Abiturient[] abiturients) {
        int length = abiturients.length;
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if (Arrays.stream(abiturients[j].getMark()).sum() < Arrays.stream(abiturients[j + 1].getMark()).sum()) {
                    Abiturient temp = abiturients[j];
                    abiturients[j] = abiturients[j + 1];
                    abiturients[j + 1] = temp;
                }
            }
        }
        return abiturients;
    }

    public static Abiturient[] getTopNMarks(Abiturient[] abiturients, int n) {
        // Логика для выбора N абитуриентов с самой высокой суммой баллов
        abiturients = Arrays.copyOfRange(sortedForMarks(abiturients), 0, n);
        return abiturients;
    }

    public static Abiturient[] getMiddleMarks(Abiturient[] abiturients) {
        int n = 0;
        abiturients = sortedForMarks(abiturients);
        int middleSum = Arrays.stream(abiturients[0].getMark()).sum() / 2;
        for (Abiturient abiturient : abiturients) {
            if (Arrays.stream(abiturient.getMark()).sum() > middleSum) {
                n++;
            }
        }
        abiturients = Arrays.copyOfRange(abiturients, 0, n);
        return abiturients;
    }
}
