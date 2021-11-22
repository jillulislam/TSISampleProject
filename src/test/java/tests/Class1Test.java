package tests;

import Main.Class1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Class1Test {

    @Test
    public void testAddition(){
    Class1 class1 = new Class1();
    Assertions.assertEquals(class1.addition(4,7),12,"Calculation is not correct");


    }
}
