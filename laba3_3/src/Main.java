import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество полиномов: ");
        int numPolinoms = scanner.nextInt();
        if (numPolinoms > 0) {


            Polinom[] Polinoms = new Polinom[numPolinoms];

            for (int i = 0; i < numPolinoms; i++) {
                System.out.print("Введите количество коэффициентов для полинома " + i + ": ");
                int numCoefficients = scanner.nextInt();
                Complex[] coefficients = new Complex[numCoefficients];
                System.out.println("Заполните коэффициенты для полинома " + i + ":");
                for (int j = 0; j < numCoefficients; j++) {
                    System.out.print("Действительная часть коэффициента " + j + ": ");
                    int real = scanner.nextInt();
                    System.out.print("Мнимая часть коэффициента " + j + ": ");
                    int imaginary = scanner.nextInt();
                    coefficients[j] = new Complex(real, imaginary);
                }

                Polinoms[i] = new Polinom(coefficients);
                System.out.println("Полином " + i + " с введенными коэффициентами создан.");
            }


            // Вычисляем сумму всех введенных полиномов
            Polinom totalSum = Polinoms[0];
            for (int i = 1; i < numPolinoms; i++) {
                totalSum = Polinom.sum(totalSum, Polinoms[i]);
            }

            // Выводим результат суммы полиномов
            System.out.println("Сумма всех полиномов:");
            for (Complex coefficient : totalSum.coefficients) {
                System.out.println(coefficient.getReal() + " + " + coefficient.getImaginary() + "i");
            }
        } else {
            System.out.println("Вы ввели неверное количество");
        }
        scanner.close();
    }
}
