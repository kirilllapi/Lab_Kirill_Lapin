public class Polinom {
    Complex[] coefficients;

    public Polinom(Complex[] coefficients) {
        this.coefficients = coefficients;
    }


    /**
     *
     * @param polynomial1 - Первый полином исходный
     * @param polynomial2 - Второй полином исходный
     * @return Возвращает сумму 2 полиномов
     */
    public static Polinom sum(Polinom polynomial1, Polinom polynomial2) {
        int maxLength = Math.max(polynomial1.coefficients.length, polynomial2.coefficients.length);
        Complex[] sumCoefficients = new Complex[maxLength];
        for (int i = 0; i < maxLength; i++) {
            Complex c1 = (i < polynomial1.coefficients.length) ? polynomial1.coefficients[i] : new Complex(0, 0);
            Complex c2 = (i < polynomial2.coefficients.length) ? polynomial2.coefficients[i] : new Complex(0, 0);

            int sumReal = c1.getReal() + c2.getReal();
            int sumImaginary = c1.getImaginary() + c2.getImaginary();

            sumCoefficients[i] = new Complex(sumReal, sumImaginary);
        }
        return new Polinom(sumCoefficients);
    }
}
