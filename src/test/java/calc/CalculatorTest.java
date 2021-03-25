package calc;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    static Calculator calculator = new Calculator ();

    @Test
    void retrun_0 () {
        assertEquals (0 , calculator.add (""));

    }

    @Test
    void return_1 () {
        assertEquals (1 , calculator.add ("1"));
    }

    @Test
    void sumOfTwoNumbers () {
        assertEquals (5 , calculator.add ("2,3"));
    }

    @Test
    void sumOfUnkhownAmoutOfNumber () {
        assertEquals (6 , calculator.add ("3,2,1"));
    }

    @Test
    void addNewLines () {
        assertEquals (6 , calculator.add ("1\n2,3"));
    }

    @Test
    void supportDifferntDelimiter(){
        assertEquals (3,calculator.add ("//;\n1,2"));
    }
    @Test
    void negativeNotAllowed(){
        try {
            calculator.add ("-1");
            fail ();
        }catch (Exception e){
        assertEquals (e.getMessage (),"-1 Negative not allowed");

        }

    }
    @Test
    void noNegativeValue(){
        try {
            calculator.add ("-1,2,-2");
        } catch (Exception e) {
            assertEquals (e.getMessage (),"-1 Negative not allowed");
        }

    }
    @Test
    void numberBiggerThan1000Ignore(){
        assertEquals (4,calculator.add ("2,1001,2,1002"));
    }

    @Test
    void acceptAnyLength(){
        assertEquals (6,calculator.add ("//*%\n1*2%3"));
    }

    @Test
    void handleMultipleDelimiterAnyLength(){
        assertEquals (6,calculator.add ("*;,1%2#3"));
    }
}