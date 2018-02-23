import complex_number.ComplexAlgebraic;
import complex_number.ComplexBaseMath;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexAlgebraicTest {

    @Test
    public void testAlgebraicForm(){

        ComplexBaseMath algebraicZ = new ComplexAlgebraic(1,0);

        //z = 2+4i What do we want

        String expected="1.0+2.0i";
        assertEquals(expected,algebraicZ.toString());

    }
}
