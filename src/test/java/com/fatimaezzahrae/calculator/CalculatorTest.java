package com.fatimaezzahrae.calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
   // @BeforeEach
   // public void setUp(){
    //    calc = new Calculator();
   // }
   // @AfterEach
  //  public void tearDown(){
   //     calc = null;
   // }
    @Test
    void add() {
        assertEquals(10,Calculator.add(5,5));
    }

    @Test
    void divide() {
        assertEquals(50,Calculator.divide(100,2));

    }
}