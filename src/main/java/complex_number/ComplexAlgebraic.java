package complex_number;

public class ComplexAlgebraic extends ComplexNumber {
    public ComplexAlgebraic(double realNumber, double imaginaryNumber ) {
        super(realNumber, imaginaryNumber );
    }

    @Override
    public String toString() {
        String sign = super.getImaginaryNumber() >0 ? "+" :"-";
        return super.getRealNumber()+sign+super.getImaginaryNumber()+""+super.getImaginaryUnit();
    }
}
