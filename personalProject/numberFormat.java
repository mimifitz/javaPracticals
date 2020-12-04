import java.numberFormat;
import java.text.NumberFormat;

public class numberFormat {
    public static void main(String[] args) {
        // FORMATTING NUMBERS
        // NumberFormat currency = NumberFormat.getCurrencyInstance();
        // String result = currency.format(66778.89);
        // System.out.println(result); //prints 66,778.89 euros

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(5.9);
        System.out.println(result); // prints 590%
    }
}
