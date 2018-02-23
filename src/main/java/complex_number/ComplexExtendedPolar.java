package complex_number;

public class ComplexExtendedPolar extends ComplexPolar {


    /**
     * Construct complex number from absolute value and angle
     *
     * @param absolute
     * @param angle
     */
    public ComplexExtendedPolar(double absolute, double angle) {
        super(absolute, angle);
    }

    /**
     * Returns complex number in extended polar form of string
     *
     * @param type    type of complex number
     * @param roundTo number to round result
     * @return complex number in string
     */

    public String toExtendedPolarString(String type, double roundTo) {

        return type + "=" + ComplexBaseMath.roundNumber(modulus(), roundTo) + "(cos("
                + ComplexBaseMath.roundNumber(degrees(), roundTo) + ")+"
                + "jsin(" + ComplexBaseMath.roundNumber(degrees(), roundTo)
                + "))";

    }

    @Override
    public String toString() {
        return "";
    }
}
