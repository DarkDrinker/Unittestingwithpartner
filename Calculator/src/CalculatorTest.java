import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10,10);
        assertEquals(result,20);
    }

    @Test
    void multiply(){
        Calculator calculator = new Calculator();
        double result = calculator.multiply(10,10);
        assertEquals(result,100);
    }

}

