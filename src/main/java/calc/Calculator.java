package calc;

public class Calculator {

    public int add ( String number ) {

        String[] strings = number.split (",");

        if (number.isEmpty ()) {
            return 0;
        }
        if (number.length () < 2) {
            return Integer.parseInt (number);
        }else {
            return Integer.parseInt (strings[0])+Integer.parseInt (strings[1]);
        }
    }
}
