package complex_number;

/**
 * @author Dragutin Horvat
 * @version 1.03
 * @update corrected multiplication @version 1.02
 * @update corrected nullpointer exception at plus method @version 1.03
 */
public class ComplexNumberMath extends BaseMath {

    private final double re, imag;

    /**
     * Constructor for complex number
     *
     * @param real part of number
     * @param imag part of number
     */

    public ComplexNumberMath(double real, double imag) {

        this.re = real;
        this.imag = imag;

    }

    public double getRe() {
        return re;
    }

    public double getImag() {
        return imag;
    }

    /**
     * Returns complex number in trigonometric form of string
     *
     * @param type    of complex number
     * @param roundTo number to round result
     * @return complex number in string
     */
    public String toCartesianString(String type, double roundTo) {

        if (imag == 0 && re >= 0) {

            return type + "=" + SiPrefixsMath.roundNumber(re, roundTo);

        } else if (re == 0 && imag >= 0) {

            return type + "=" + "j" + SiPrefixsMath.roundNumber(imag, roundTo);

        } else if (re == 0 && imag < 0) {

            return type + "=" + "-" + "j"
                    + SiPrefixsMath.roundNumber(-imag, roundTo);

        } else if (re > 0 && imag < 0) {

            return type + "=" + SiPrefixsMath.roundNumber(re, roundTo) + "-"
                    + "j" + SiPrefixsMath.roundNumber((-imag), roundTo);

        }

        return type + "=" + SiPrefixsMath.roundNumber(re, roundTo) + "+" + "j"
                + SiPrefixsMath.roundNumber(imag, roundTo);

    }

    /**
     * Returns complex number in polar form
     *
     * @param type
     * @param roundTo
     * @return
     */
    public String toPolarString(String type, double roundTo) {

        return type + "=" + SiPrefixsMath.roundNumber(abs(), roundTo) + "∠"
                + SiPrefixsMath.roundNumber(degrees(), roundTo);
    }

    /**
     * Returns complex number in extended polar form of string
     *
     * @param type    type of complex number
     * @param roundTo number to round result
     * @return complex number in string
     */

    public String toExtendedPolarString(String type, double roundTo) {

        return type + "=" + SiPrefixsMath.roundNumber(abs(), roundTo) + "(cos("
                + SiPrefixsMath.roundNumber(degrees(), roundTo) + ")+"
                + "jsin(" + SiPrefixsMath.roundNumber(degrees(), roundTo)
                + "))";

    }

    /**
     * Returns complex number in exponential form of string
     *
     * @param type
     * @param roundTo
     * @return
     */
    public String toExponentialString(String type, double roundTo) {

        String htmlText = "<body>" + type + "="
                + SiPrefixsMath.roundNumber(abs(), roundTo) + "e" + "<sup>"
                + SiPrefixsMath.roundNumber(toRadians(), roundTo) + "</sup>"
                + "</body>";

        //Spanned text = Html.fromHtml(htmlText);

        return htmlText.toString();
    }

    /**
     * Calculates absolute value of complex number
     *
     * @return double value
     */
    public double abs() {

        return Math.hypot(re, imag);
    }

    /**
     * Calculates atan2 of complex number
     *
     * @return radians in double value
     */
    public double toRadians() {

        double value = 0;

        if (re > 0 && imag > 0) {

            value = Math.atan2(imag, re);

        } else if (re < 0 && imag >= 0) {

            value = Math.atan2(imag, re) + Math.PI;

        } else if (re < 0 && imag < 0) {

            value = Math.atan2(imag, re) - Math.PI;

        } else if (re == 0 && imag > 0) {

            value = Math.PI / 2;

        } else if (re == 0 && imag < 0) {

            value = -Math.PI / 2;

        } else if (re == 0 && imag == 0) {

            value = 0.0;

        } else if (re > 0 && imag < 0) {

            value = Math.atan2(imag, re);

        }

        return value;

    }

    /**
     * Calculates angel, of complex number
     *
     * @return angle in double value
     */
    public double degrees() {

        double radians = Math.atan2(imag, re);

        if (re > 0 && imag > 0) {

            return Math.toDegrees(radians);

        } else if (re < 0 && imag >= 0) {

            return Math.toDegrees(radians) + 180;

        } else if (re < 0 && imag < 0) {

            return Math.toDegrees(radians) - 180;

        } else if (re == 0 && imag > 0) {

            return 90;

        } else if (re == 0 && imag < 0) {

            return -90;

        } else if (re == 0 && imag == 0) {

            return 0.0;
        }

        return Math.toDegrees(radians);

    }

    /**
     * Subtract ComplexNumber
     *
     * @param b second complex number
     * @return new complex number
     */

    public ComplexNumberMath minus(ComplexNumberMath b) {

        ComplexNumberMath a = this;

        double real = a.re - b.re;
        double imag = a.imag - b.imag;

        return new ComplexNumberMath(real, imag);

    }

    /**
     * Calculate complex number
     *
     * @param b second complex number
     * @return new ComplexNumber
     */
    public ComplexNumberMath times(ComplexNumberMath b) {

        ComplexNumberMath a = this;

        double real = ((a.re * b.re) - (a.imag * b.imag));
        double imag = a.re * b.imag + a.imag * b.re;

        return new ComplexNumberMath(real, imag);

    }

    /**
     * Calculate complex number with real number
     *
     * @param number real number
     * @return ComplexNumber
     */
    public ComplexNumberMath timesAlpha(double number) {

        return new ComplexNumberMath(number * re, number * imag);

    }

    /**
     * Adds complex number
     *
     * @param b second number
     * @return new complex number
     */

    public ComplexNumberMath plus(ComplexNumberMath b) {
        ComplexNumberMath a = this;

        double real = a.re + b.re;
        double imag = a.imag + b.imag;

        return new ComplexNumberMath(real, imag);

    }

    /**
     * Returns divided complex number
     *
     * @param b
     * @return
     */
    public ComplexNumberMath divides(ComplexNumberMath b) {

        ComplexNumberMath a = this;

        return a.times(b.reciprocal());

    }

    /**
     * Returns reciprocal value of complex number
     *
     * @return
     */
    public ComplexNumberMath reciprocal() {

        double temp = re * re + imag * imag;

        return new ComplexNumberMath(re / temp, -imag / temp);

    }

}
