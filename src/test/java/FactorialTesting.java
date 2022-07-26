import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTesting {

    @Test
    void ShouldBeGreaterThanZero(){
        Factorial fact = new Factorial(-1);
        int value = fact.calculate();
        assertEquals(-1, value);
    }

    @Test
    void ShouldBeOne(){
        Factorial fact = new Factorial(0);
        int value = fact.calculate();
        assertEquals(1, value);
    }


}
