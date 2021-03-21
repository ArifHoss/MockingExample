package calc;

public class Calculator {

    public int add ( String number ) {

        String[] strings = number.split (",");
        int sum = 0;

        if (number.isEmpty ()) {
            return 0;
        } else{
            for (String s: strings) {
                sum += Integer.parseInt (s);
            }
        } return sum;
    }
}
