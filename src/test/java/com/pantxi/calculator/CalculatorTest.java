package com.pantxi.calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
public class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    public void setup(){
        calc = new Calculator();
        System.out.println("Declaration");
    }
    @AfterEach
    public void teardown(){
        calc = null;
        System.out.println("Detruire");
    }
    @Test
    public void Addition() {


        assertEquals(7,calc.add(4,3));
    }
    @Test
    public void Division() {

        assertEquals(50,calc.divide(100,2));
    }


}
