import complex_number.ComplexNumber;
import complex_number.ComplexNumberParser;
import complex_number.ComplexParser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexNumberParserTest {

    @Test
    public void testObjectCreation_stringScenario(){
        ComplexNumber expectedZ=new ComplexNumber(1,3);
        ComplexNumberParser resultZ = new ComplexNumberParser(1);
                        resultZ.parse("1+3i");
        System.out.println(""+resultZ.getNumb());
        assertEquals(expectedZ,resultZ);

    }


}
