import complex_number.ComplexBaseMath;
import complex_number.ComplexNumber;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexNumberTest {

    ComplexNumber z1;
    ComplexNumber z2;
    ComplexBaseMath z3;
    ComplexBaseMath expectedZ;

    @Before
    public void initData(){
        //Context
         z1 = new ComplexNumber(1,2);
         z2 = new ComplexNumber(1,2);
    }

    @Test
    public void testAdditions(){

        z3=z1.addition(z2);
        expectedZ =new ComplexNumber(2,4);
        assertEquals(expectedZ,z3);

    }

    @Test
    public  void testSubtraction(){

        z3= z1.subtraction(z2);
        expectedZ =new ComplexNumber(0,0);
        assertEquals(expectedZ,z3);

    }

    @Test
    public void testDivision(){
        z3=z1.division(z2);
        expectedZ= new ComplexNumber(1,0);
        assertEquals(expectedZ,z3);

    }
    @Test
    public void testMultiplication(){

        z3=z1.multiplication(z2);
        expectedZ= new ComplexNumber(-3,4);
        assertEquals(expectedZ,z3);

    }
    @Test
    public void testAlphaMultiplication(){
        ComplexBaseMath z3 =z1.multiplication(2);
        expectedZ= new ComplexNumber(2,4);
        assertEquals(expectedZ,z3);
    }
    @Test
    public void testAbsoluteValue(){
        double result=z1.modulus();
        double expectedNumber= 2.2360679775 ;
        assertEquals(expectedNumber,result,0);
    }




}
