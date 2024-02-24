import java.util.Scanner;

/**
 * Операции над комплексными числами
 */
public class ComplexProcessing {
    /**
     * Метод сложения всех элементов массива состоящего из комплексных чисел
     * @param complexes - Исходный массив комплексных чисел
     * @return Возвращает результат сложения в виде комплексного числа
     */
    public static Complex addition(Complex[] complexes) {
        int real = 0;
        int imaginary = 0;
        for (Complex complex : complexes) {
            real += complex.getReal();
            imaginary += complex.getImaginary();
        }
        return new Complex(real, imaginary);
    }

    /**
     * Метод умножения всех элементов массива состоящего из комплексных чисел
     * @param complexes - Исходный массив комплексных чисел
     * @return Возвращает результат умножения в виде комплексного числа
     */
    public static Complex multiply(Complex[] complexes) {
        for (int i = 1; i < complexes.length; i++) {
            int realFirst = complexes[0].getReal();
            int imaginaryFirst = complexes[0].getImaginary();

            int realSecond = complexes[i].getReal();
            int imaginarySecond = complexes[i].getImaginary();

            int newReal = realFirst * realSecond - imaginaryFirst * imaginarySecond;
            int newImaginary = imaginaryFirst * realSecond + realFirst * imaginarySecond;

            complexes[0] = new Complex(newReal, newImaginary);
        }
        return complexes[0];
    }
}