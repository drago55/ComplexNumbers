package complex_number;

/**
 * @author Dragutin Horvat
 * @version 1.03
 * @update corrected multiplication @version 1.02
 * @update corrected nullpointer exception at plus method @version 1.03
 */
public class ComplexNumber extends ComplexBaseMath {

    private double realNumber;
    private double imaginaryNumber;
    private ImaginaryUnit imaginaryUnit;

    /**
     * Constructor for complex number
     *
     * @param real part of Complex number
     * @param imaginaryNumber part of Complex number
     */

    public ComplexNumber(double real, double imaginaryNumber) {

        this.realNumber = real;
        this.imaginaryNumber = imaginaryNumber;
        this.imaginaryUnit=ImaginaryUnit.I;
    }

    public double getRealNumber() {
        return realNumber;
    }

    public double getImaginaryNumber() {
        return imaginaryNumber;
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof ComplexNumber)) return false;
        ComplexNumber complexNumber=(ComplexNumber) obj;
        return  this.realNumber==complexNumber.getRealNumber() && this.imaginaryNumber==complexNumber.getImaginaryNumber();
    }

    /**
     * Returns complex number in trigonometric form of string
     *
     * @param type    of complex number
     * @param roundTo number to round result
     * @return complex number in string
     */
    public String toCartesianString(String type, double roundTo) {

        if (imaginaryNumber == 0 && realNumber >= 0) {

            return type + "=" + ComplexBaseMath.roundNumber(realNumber, roundTo);

        } else if (realNumber == 0 && imaginaryNumber >= 0) {

            return type + "=" + "j" + ComplexBaseMath.roundNumber(imaginaryNumber, roundTo);

        } else if (realNumber == 0 && imaginaryNumber < 0) {

            return type + "=" + "-" + "j"
                    + ComplexBaseMath.roundNumber(-imaginaryNumber, roundTo);

        } else if (realNumber > 0 && imaginaryNumber < 0) {

            return type + "=" + ComplexBaseMath.roundNumber(realNumber, roundTo) + "-"
                    + "j" + ComplexBaseMath.roundNumber((-imaginaryNumber), roundTo);

        }

        return type + "=" + ComplexBaseMath.roundNumber(realNumber, roundTo) + "+" + "j"
                + ComplexBaseMath.roundNumber(imaginaryNumber, roundTo);

    }


    /**
     * Calculates atan2 of complex number
     *
     * @return radians in double value
     */
    public double toRadians() {

        double value = 0;

        if (realNumber > 0 && imaginaryNumber > 0) {

            value = Math.atan2(imaginaryNumber, realNumber);

        } else if (realNumber < 0 && imaginaryNumber >= 0) {

            value = Math.atan2(imaginaryNumber, realNumber) + Math.PI;

        } else if (realNumber < 0 && imaginaryNumber < 0) {

            value = Math.atan2(imaginaryNumber, realNumber) - Math.PI;

        } else if (realNumber == 0 && imaginaryNumber > 0) {

            value = Math.PI / 2;

        } else if (realNumber == 0 && imaginaryNumber < 0) {

            value = -Math.PI / 2;

        } else if (realNumber == 0 && imaginaryNumber == 0) {

            value = 0.0;

        } else if (realNumber > 0 && imaginaryNumber < 0) {

            value = Math.atan2(imaginaryNumber, realNumber);

        }

        return value;

    }

    /**
     * Calculates angel, of complex number
     *
     * @return angle in double value
     */
    public double degrees() {

        double radians = Math.atan2(imaginaryNumber, realNumber);

        if (realNumber > 0 && imaginaryNumber > 0) {

            return Math.toDegrees(radians);

        } else if (realNumber < 0 && imaginaryNumber >= 0) {

            return Math.toDegrees(radians) + 180;

        } else if (realNumber < 0 && imaginaryNumber < 0) {

            return Math.toDegrees(radians) - 180;

        } else if (realNumber == 0 && imaginaryNumber > 0) {

            return 90;

        } else if (realNumber == 0 && imaginaryNumber < 0) {

            return -90;

        } else if (realNumber == 0 && imaginaryNumber == 0) {

            return 0.0;
        }

        return Math.toDegrees(radians);

    }


    /**
     * Adds complex number to this instance
     *
     * @param z second number
     * @return new complex number
     */
    @Override
    public ComplexNumber addition(ComplexNumber z) {

        ComplexNumber a = this;
        double real = a.realNumber + z.realNumber;
        double imag = a.imaginaryNumber + z.imaginaryNumber;

        return new ComplexNumber(real, imag);
    }

    /**
     * Subtract ComplexNumber
     *
     * @param z second complex number
     * @return new complex number
     */
    @Override
    public ComplexNumber subtraction(ComplexNumber z) {
        ComplexNumber a = this;

        double real = a.realNumber - z.realNumber;
        double imag = a.imaginaryNumber - z.imaginaryNumber;

        return new ComplexNumber(real, imag);
    }

    /**
     * Calculate complex number
     *
     * @param z second complex number
     * @return new ComplexNumber
     */
    @Override
    public ComplexNumber multiplication(ComplexNumber z) {
        ComplexNumber a = this;
        double real = ((a.realNumber * z.realNumber) - (a.imaginaryNumber * z.imaginaryNumber));
        double imag = a.realNumber * z.imaginaryNumber + a.imaginaryNumber * z.realNumber;
        return new ComplexNumber(real, imag);
    }
    /**
     * Multiply complex number with number
     *
     * @param number
     * @return ComplexNumber
     */
    public ComplexNumber multiplication(double number){
        return new ComplexNumber(number * realNumber, number * imaginaryNumber);
    }
    /**
     * Returns divided complex number
     *
     * @param z
     * @return
     */
    @Override
    public ComplexNumber division(ComplexNumber z) {
        ComplexBaseMath a = this;
        return a.multiplication(z.reciprocal());
    }

    @Override
    public ComplexNumber squareRoot(ComplexNumber z) {
        return null;
    }


    /**
     * Calculates absolute value of complex number
     *
     * @return double value
     */
    @Override
    public double modulus() {
        return Math.hypot(realNumber, imaginaryNumber);
    }

    /**
     * Returns reciprocal value of complex number
     *
     * @return
     */
    @Override
    public ComplexNumber reciprocal() {

        double temp = realNumber * realNumber + imaginaryNumber * imaginaryNumber;

        return new ComplexNumber(realNumber / temp, -imaginaryNumber / temp);

    }

    public String getImaginaryUnit() {
        return this.imaginaryUnit.getValue();
    }

}
