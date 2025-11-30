package com.pantxi.calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    @Test
    public void Addition() {
        Calculator calcul = new Calculator();
        int result = calcul.add(2, 3);
        assertEquals(5, result, "2 + 3 doit être égal à 5");

    }

}
