package tests;

import Main.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition(){
    Calculator class1 = new Calculator();
    Assertions.assertEquals(11,class1.addition(7,4),"Addition is not correct");
    }

    @Test
    public void testSubtraction(){
        Calculator class1 = new Calculator();
        Assertions.assertEquals(5,class1.subtraction(10.4,8.1),"Subtraction is not correct");
    }

    @Test
    public void testMultiplication(){
        Calculator class1 = new Calculator();
        Assertions.assertEquals(5,class1.subtraction(10.4,8.1),"Multiplication is not correct");
    }

    @Test
    public void testDivision(){
        Calculator class1 = new Calculator();
        Assertions.assertEquals(5,class1.subtraction(10.4,8.1),"Division is not correct");
    }

}
