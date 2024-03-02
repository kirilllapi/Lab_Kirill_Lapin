public class Polinom {
    Complex[] coefficients;

    public Polinom(Complex[] coefficients) {
        this.coefficients = coefficients;
    }


    /**
     * Нахождение суммы 2 полиномов
     *
     * @param polynomial1 Первый полином исходный
     * @param polynomial2 Второй полином исходный
     * @return Возвращает сумму 2 полиномов
     */
    public static Polinom Sum(Polinom polynomial1, Polinom polynomial2) {
        int maxLength = Math.max(polynomial1.coefficients.length, polynomial2.coefficients.length);
        Complex[] sumCoefficients = new Complex[maxLength];
        for (int i = 0; i < maxLength; i++) {
            Complex c1;
            Complex c2;

            int lengtCoeff1 = polynomial1.coefficients.length;
            int lengtCoeff2 = polynomial2.coefficients.length;

            if (i < lengtCoeff1) {
                c1 = polynomial1.coefficients[i];
            } else {
                c1 = new Complex(0, 0);
            }

            if (i < lengtCoeff2) {
                c2 = polynomial2.coefficients[i];
            } else {
                c2 = new Complex(0, 0);
            }

            int sumReal = c1.getReal() + c2.getReal();
            int sumImaginary = c1.getImaginary() + c2.getImaginary();

            sumCoefficients[i] = new Complex(sumReal, sumImaginary);
        }
        return new Polinom(sumCoefficients);
    }

    /**
     * Нахождение сумм всех полиномов
     * @param numPolinoms Количество полиномов
     * @param totalSum    Сумма накопления
     * @param Polinoms    Массив всех исходных полиномов
     * @return Сумма всех полиномов
     */
    public static Polinom AllSum(int numPolinoms, Polinom totalSum, Polinom[] Polinoms) {
        for (int i = 1; i < numPolinoms; i++) {
            totalSum = Sum(totalSum, Polinoms[i]);
        }
        return totalSum;
    }
}
