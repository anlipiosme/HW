import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {

    @Test
    void testCalculateFactorial() {

        assertEquals(1, Factorial.findFactorial(1));
        assertEquals(120, Factorial.findFactorial(5));
    }
}