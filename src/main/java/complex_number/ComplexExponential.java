package complex_number;

public class ComplexExponential extends ComplexNumber {
    public ComplexExponential(double absoluteValue, double angle) {
        super(absoluteValue,angle);
        }
    /**
     * Returns complex number in exponential form of string
     *
     * @param type
     * @param roundTo
     * @return
     */
    public String toExponentialString(String type , double roundTo) {

        String htmlText = "<body>" + type + "="
                + ComplexBaseMath.roundNumber(modulus(), roundTo) + "e" + "<sup>"
                + ComplexBaseMath.roundNumber(toRadians(), roundTo) + "</sup>"
                + "</body>";

        //Spanned text = Html.fromHtml(htmlText);

        return htmlText;
    }

    @Override
    public String toString() {
        return "";
    }
}
