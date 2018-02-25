package complex_number;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class ComplexNumberParser implements ComplexParser {

    private ComplexNumber complexNumber;
    private int numb=35;
    public ComplexNumberParser(int num) {
            this.numb=this.numb;
    }

    public int getNumb() {
        return numb;
    }

    public ComplexNumber getComplexNumber() {
        return complexNumber;
    }

    @Override
    public void parse(String text) {
        if(text ==null) throw new NullPointerException("Parameter can't be null!");
        if(text.equals("")) throw new IllegalArgumentException("No argument...");
        // boolean isImaginaryPartPresent =args.contains("j") | args.contains("i");
        //   boolean isPlusPresent= args.contains("+");



        String letters= "[a-hk-zA-HK-Z]+";
        Predicate<String> isImaginaryPartPresent =(s) -> s.contains("j") | s.contains("i");
        Predicate<String> isThereOtherLeters= (s) -> s.matches(letters);
        Predicate<String> isPlusPresent =(s) -> s.contains("+");
        String alfabet="ABCDEFGHIJKLMNOPQRSTUVWXYZasdfghjklqwertyuiopzxcvbnm";
        Stream.of(alfabet).filter(isThereOtherLeters).peek(System.out::println).forEach(System.out::println);

        // if(isImaginaryPartPresent)
        String delims = "[+\\-*/ij\\^]+"; // so the delimiters are:  + - * / ^ space

        String[] tokens;
        tokens = text.split(delims);


    }
}
