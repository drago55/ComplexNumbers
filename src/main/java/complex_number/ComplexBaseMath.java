package complex_number;

/**
 * @author drago
 */

public abstract class ComplexBaseMath {

    public static final double ROUND_TO_TWO_DECIMAL=100;
    public static final double ROUND_TO_TREE_DECIMAL=1000;
    public static final double ROUND_TO_FOUR_DECIMAL=10000;
    public static final double ROUND_TO_SIX_DECIMAL = 1000000;

    /**
     * Round number
     *
     * @param num   to be rounded
     * @param round number of decimal places
     * @return rounded number
     */
   public static double roundNumber(double num, double round) {

        return Math.round(num * round) / round;
    }


    /**
     * Creates a string in degrees minutes seconds 63°26'6″
     * @param degrees decimal
     * @return
     */
   public static String toStringDegrees(double degrees){

        Double d= new Double(degrees);
        Double m = (d-d.intValue()) *60;
        Double s=(m-m.intValue())*60;

       return d.intValue()+"°"+m.intValue()+"'"+Math.round(s)+"″";
    }

    public abstract ComplexNumber addition(ComplexNumber z);
    public abstract ComplexNumber subtraction(ComplexNumber z);
    public abstract ComplexNumber multiplication(ComplexNumber z);
    public abstract ComplexNumber division(ComplexNumber z);
    public abstract ComplexNumber squareRoot(ComplexNumber z);
    public abstract double modulus();
    public abstract ComplexNumber reciprocal();

}
