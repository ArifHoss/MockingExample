package calc;

public class Calculator {

    public int add ( String number ) {

        if (number.length () == 0)
            return 0;
        checkNegative (values(number));
        return sumOfValue (values (number));

    }

    private String[] values ( String string ) {
        return numbers (string).split (delimiter (string));
    }

    private String delimiter ( String string ) {
        String delimiter = ",|;|\n";
        if (string.startsWith ("//" + delimiter))
            delimiter = string.substring (2 , 4);
        return delimiter;
    }

    private String numbers ( String string ) {
        String values = string;
        if (string.startsWith ("//"))
            values = string.substring (4);
        return values;
    }

    private int sumOfValue ( String[] values ) {
        int total = 0;
        for (String value : values) {
            total += toInt (value);
        }
        return total;
    }

    private void checkNegative ( String[] values ) {
        String negatives = "";
        for (String value: values) {
            if(toInt (value)<0)
                negatives+=","+value;
        }
        if (negatives.length () >0)
            throw new RuntimeException (negatives.substring (1));
    }

    private Integer toInt ( String value ) {
        Integer integer = Integer.valueOf (value);
        if (integer<0)
            throw new RuntimeException (value);
        return integer;
    }


}
