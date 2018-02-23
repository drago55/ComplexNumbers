package complex_number;


public class ComplexPolar extends ComplexNumber {

    /**
     * @author Dragutin Horvat
     * @version 1.0
     *
     */

    /**
     * Construct complex number from absolute value and angle
     *
     * @param absolute
     * @param angle
     */
    public ComplexPolar(double absolute, double angle) {

        super((absolute * Math.cos(angle)), (absolute * Math.sin(angle)));

    }

    @Override
    public String toString() {
    return "";
    }

    /**
     * Returns complex number in polar form
     *
     * @param type
     * @param roundTo
     * @return
     */
    public String toPolarString(String type, double roundTo) {

        return type + "=" + ComplexBaseMath.roundNumber(modulus(), roundTo) + "∠"
                + ComplexBaseMath.roundNumber(degrees(), roundTo);
    }

}
