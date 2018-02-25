package complex_number;

public class ComplexTrigonometric extends ComplexNumber {




    /**
     * Construct complex number from absolute value and angle
     *
     * @param absolute
     * @param angle
     */
    public ComplexTrigonometric(double absolute, double angle) {
        super(absolute, angle);
    }

    /**
     *
     * @return string representation of complex number in polar form
     */
    @Override
    public String toString() {
        return ComplexBaseMath.roundNumber(modulus(),ROUND_TO_SIX_DECIMAL) + "(cos("
                + ComplexBaseMath.toStringDegrees(degrees()) + ")+"
                + getImaginaryUnit() +"sin(" + ComplexBaseMath.toStringDegrees(degrees())
                + "))";
    }
}
