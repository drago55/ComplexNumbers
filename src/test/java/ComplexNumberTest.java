import complex_number.ComplexBaseMath;
import complex_number.ComplexNumber;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class ComplexNumberTest {

    private static ComplexNumber z1;
    private static ComplexNumber z2;
    private static ComplexBaseMath z3;
    private static ComplexBaseMath expectedZ;

    @BeforeClass
    public static void initData(){
        //Context
         z1 = new ComplexNumber(1,2);
         z2 = new ComplexNumber(1,2);
    }


    @Test
    public void testObjectCreation(){
        ComplexBaseMath zExpected= new ComplexNumber(1,2);
        assertEquals(zExpected, new ComplexNumber(1,2));
    }


    @Test
    public void testObjectCreation_minusScenario(){
        ComplexBaseMath zExpected= new ComplexNumber(-1,-2);
        assertEquals(zExpected, new ComplexNumber(-1,-2));
    }

    @Test
    public void testObjectCreation_zeroScenario(){
        ComplexBaseMath zExpected= new ComplexNumber(0,0);
        assertEquals(zExpected, new ComplexNumber(0,0));
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
        assertEquals(expectedNumber,result,1);
    }




}
