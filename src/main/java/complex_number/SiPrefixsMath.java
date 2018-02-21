package complex_number;

/*  This code is extracted from android application and shows mistakes with coupling UI with business logic
import android.annotation.SuppressLint;
import android.widget.Spinner;
*/
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Dragutin Horvat
 * @version 1.1 added time parser
 */


public class SiPrefixsMath {


    public static final Map<Integer, String> prefixes;

    static {
        Map<Integer, String> tempPrefixes = new HashMap<Integer, String>();
        tempPrefixes.put(0, "");
        tempPrefixes.put(3, "k");
        tempPrefixes.put(6, "M");
        tempPrefixes.put(9, "G");
        tempPrefixes.put(12, "T");
        tempPrefixes.put(-3, "m");
        tempPrefixes.put(-6, "u");
        tempPrefixes.put(-9, "n");
        tempPrefixes.put(-12, "p");
        prefixes = Collections.unmodifiableMap(tempPrefixes);
    }

    String type;
    double value;
    double roundNum;

    public SiPrefixsMath(double value, String type, double roundNum) {
        this.value = value;
        this.type = type;
        this.roundNum = roundNum;
    }

    /**
     * Round number
     *
     * @param num   to be rounded
     * @param round number of decimal places
     * @return rounded number
     */
    public static final double roundNumber(double num, double round) {

        return Math.round(num * round) / round;
    }

    /**
     * Calculate prefix value from spinner position
     * 10to the power of value of the spinner
     *
     * @param value   to calculate
     * @param spinner spinner id to get position from
     * @return multiplied result
     */

    /*

    public static double getData(double value, Spinner spinner) {

        double result = 0;

        int position = spinner.getLastVisiblePosition();
        int i = 0;

        i = ((position * 3) - 12);
        result = value * Math.pow(10, i);
        return result;

    }
*/
    /**
     * Calculates time from spinner position h,min,s
     *
     * @param value   to calculate
     * @param spinner spinner id to get position from
     * @return multiplied result
     */

    /*
    public static double getTimeData(double value, Spinner spinner) {
        int position = spinner.getLastVisiblePosition();
        double result = 0;
        switch (position) {
            case 0:
                // h
                result = value * 3600;

                break;

            case 1:
                // min
                result = value * 60;
                break;

            case 2:
                // sec
                result = value;
                break;
        }
        return result;

    }
*/
    /**
     * Method for adding a prefix to number
     *
     * @return number in string with prefix rounded to max 6 significant number
     */
    public String toPrefixString() {
        double tval = value;
        int order = 0;
        if (value == 0) {

            return tval + prefixes.get(order) + type;
        } else if (value < 0) {
            tval = -(value);
            while (tval > 1000.0) {
                tval /= 1000;
                order += 3;
            }
            while (tval < 1.0) {
                tval *= 1000.0;
                order -= 3;
            }

            return "-" + Math.round(tval * roundNum) / roundNum
                    + prefixes.get(order) + type;

        } else {

            while (tval > 1000.0) {
                tval /= 1000;
                order += 3;
            }
            while (tval < 1.0) {
                tval *= 1000.0;
                order -= 3;
            }

        }

        if (prefixes.get(order) == null) {
            // TODO missing prefix problem
            return Math.round(tval * roundNum) / roundNum + type;

        }
        return Math.round(tval * roundNum) / roundNum + prefixes.get(order)
                + type;
    }

}
