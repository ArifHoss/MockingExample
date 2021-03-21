package calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    static Calculator calculator = new Calculator ();

    @Test
    void retrun_0 (){
        assertEquals (0,calculator.add (""));

    }
    @Test
    void return_1(){
        assertEquals (1,calculator.add ("1"));
    }
    @Test
    void sumOfTwoNumbers(){
        assertEquals (5,calculator.add ("2,3"));
    }
    @Test
    void sumOfUnkhownAmoutOfNumber(){
        assertEquals (6,calculator.add ("3,2,1"));
    }
    @Test
    void addNewLines(){
        assertEquals (6,calculator.add ("1\n2,3"));
    }

}