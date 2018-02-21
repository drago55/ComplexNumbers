package complex_number;


public class ComplexPolar extends ComplexNumberMath {

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

}
