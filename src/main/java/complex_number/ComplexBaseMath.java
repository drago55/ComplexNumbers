package complex_number;

/**
 * @author drago
 */

public abstract class ComplexBaseMath {

    /**
     * Round number
     *
     * @param num   to be rounded
     * @param round number of decimal places
     * @return rounded number
     */
    static double roundNumber(double num, double round) {

        return Math.round(num * round) / round;
    }

    public abstract ComplexNumber addition(ComplexNumber z);
    public abstract ComplexNumber subtraction(ComplexNumber z);
    public abstract ComplexNumber multiplication(ComplexNumber z);
    public abstract ComplexNumber division(ComplexNumber z);
    public abstract ComplexNumber squareRoot(ComplexNumber z);
    public abstract double modulus();
    public abstract ComplexNumber reciprocal();

}
