import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void minustest() {
        Calculator calculator = new Calculator();
        assertEquals(10,calculator.minus(20,10));
    }

    @Test
    void dividetest() {
        Calculator calculator = new Calculator();
        assertEquals(2,calculator.divide(20,10));
    }
}