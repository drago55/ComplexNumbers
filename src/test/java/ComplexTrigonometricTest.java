
import complex_number.ComplexBaseMath;
import complex_number.ComplexExponential;
import complex_number.ComplexTrigonometric;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexTrigonometricTest {

    @Test
    public void testExponentialForm(){
        //What do we want
       // z = 4.472136 × (cos 63°26'6″ + i sin 63°26'6″)


        ComplexBaseMath exponentialZ= new ComplexTrigonometric(2,4);
        String expected="4.472136(cos(63°26'6″)+isin(63°26'6″))";
        assertEquals(expected,exponentialZ.toString());

    }

}