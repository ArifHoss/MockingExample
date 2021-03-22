package calc;

public class Calculator {

    public int add ( String number ) {

        if (number.isEmpty ())
            return 0;
        return sumOfValue (number.split (",|\n"));
    }

    private int sumOfValue ( String[] values ) {
        int sum = 0;
        for (String s : values) {
            sum += Integer.valueOf (s);
        }
        return sum;
    }

}
