package calc;

import java.util.Arrays;

public class Calculator {

    public int add ( String number ) {
        String [] strings = number.split ("[^-\\d]");

        int [] toInt =
        Arrays.stream (strings)
                .filter (t -> !t.isEmpty ())
                .mapToInt (Integer::parseInt)
                .toArray ();

        return sumOfValue (toInt);

  }

    private int sumOfValue ( int[] toInt ) {
        int total = 0;
        for (int value : toInt) {

            if(value > 1000){
                continue;

            }
            //Here continue is telling us for loop will skip value more than 1000 will.
            total += value;
            if(value<0){
                throw new RuntimeException (value + " Negative not allowed");
            }
        }
        return total;
    }

}
/*
 int sum = 0;
        for (int a : numb) {
            if(a>1000){
                continue;
            }
            sum += a;
            if(a<0){
                throw new RuntimeException(a + " negatives not allowed");

            }
        }
        return sum;
    }
 */