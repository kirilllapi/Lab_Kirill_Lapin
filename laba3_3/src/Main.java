import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество полиномов: ");
        int numPolinoms = sc.nextInt();
        if (numPolinoms > 0) {


            Polinom[] Polinoms = new Polinom[numPolinoms];

            for (int i = 0; i < numPolinoms; i++) {
                System.out.print("Введите количество коэффициентов для полинома " + i + ": ");
                int numCoefficients = sc.nextInt();
                Complex[] coefficients = new Complex[numCoefficients];
                System.out.println("Заполните коэффициенты для полинома " + i + ":");
                for (int j = 0; j < numCoefficients; j++) {
                    System.out.print("Действительная часть коэффициента " + j + ": ");
                    int real = sc.nextInt();
                    System.out.print("Мнимая часть коэффициента " + j + ": ");
                    int imaginary = sc.nextInt();
                    coefficients[j] = new Complex(real, imaginary);
                }

                Polinoms[i] = new Polinom(coefficients);
                System.out.println("Полином " + i + " с введенными коэффициентами создан.");
            }


            // Cумма всех введенных полиномов
            Polinom totalSum = Polinoms[0];
            totalSum = Polinom.AllSum(numPolinoms, totalSum, Polinoms);

            // Выводим результат суммы полиномов
            System.out.println("Сумма всех полиномов:");
            for (Complex coefficient : totalSum.coefficients) {
                System.out.println(coefficient.getReal() + " + " + coefficient.getImaginary() + "i");
            }
        } else {
            System.out.println("Вы ввели неверное количество");
        }
        sc.close();
    }
}
