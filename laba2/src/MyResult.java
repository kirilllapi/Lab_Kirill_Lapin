/**
 * Объект результата нахождения максимального числа возрастающих/убываюших элементов
 */

public class MyResult {

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

