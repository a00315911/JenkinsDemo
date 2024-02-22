import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calculator.subtract(4, 3), "4 - 3 should equal 1");
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should equal 6");
    }

    // 这个测试将失败，因为我们故意提供了错误的断言
    @Test
    public void testDivision() {
        assertEquals(1, calculator.divide(2, 2), "2 / 2 should equal 1");
    }

    // 这个测试将失败，因为我们故意触发了一个异常
    @Test
    public void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0), "Division by zero should throw IllegalArgumentException");
    }
}
