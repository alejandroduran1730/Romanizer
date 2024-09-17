import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(9);
        numbers.add(49);
        numbers.add(999);

        String romanNumbers[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int romanValues[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        List<String> IntegerToRoman = new ArrayList<>();
        String temporaryRoman = "";
        int temporaryNumber;

        for (int i = 0; i < numbers.size(); i++) {
            temporaryRoman = "";
            temporaryNumber = numbers.get(i);
            for (int j = 0; j < romanValues.length; j++) {
                while (temporaryNumber >= romanValues[j]) {
                    temporaryRoman += romanNumbers[j];
                    temporaryNumber -= romanValues[j];
                }
            }
            IntegerToRoman.add(temporaryRoman);
        }

        for (String element : IntegerToRoman) {
            System.out.println(element);
        }
    }
}