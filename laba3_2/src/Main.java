import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество комплексных координат: ");
        int n = sc.nextInt();
        if (n > 0) {
            Complex[] complexes = new Complex[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Введите " + i + " координату вещественной оси: ");
                int real = sc.nextInt();
                System.out.print("Введите " + i + " координату мнимой оси: ");
                int imaginary = sc.nextInt();
                complexes[i] = new Complex(real, imaginary);
            }

            System.out.println("\nВы ввели координаты: ");
            Arrays.stream(complexes).forEach(System.out::println);

            System.out.println("\nСумма всех комплексных чисел: ");
            System.out.print(ComplexProcessing.addition(complexes));

            System.out.println("\n\nПроизведение всех комплексных чисел: ");
            System.out.print(ComplexProcessing.multiply(complexes));
        }
        else {
            System.out.println("Вы ввели неверное количество!");
        }
        sc.close();
    }
}