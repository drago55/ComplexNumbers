import complex_number.ComplexBaseMath;
import complex_number.ComplexExponential;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexExponentialTest {


    @Test
    public void testExponentialForm(){
        //What do we want
        //z =4.472136 × ei 63°26'6″

        double absoluteValue=40.0;
        double angle=30;

        ComplexBaseMath exponentialZ= new ComplexExponential(absoluteValue,angle);
        String expected="4.472136 × ei 63°26'6″";
        assertEquals(expected,exponentialZ.toString());

    }

}
