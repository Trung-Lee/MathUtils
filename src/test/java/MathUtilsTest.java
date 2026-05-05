import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    public void testAdd() {
        MathUtils math = new MathUtils();
        assertEquals(5, math.add(2, 3));
    }

    @Test
    public void testSubtract() {
        MathUtils math = new MathUtils();
        assertEquals(2, math.subtract(5, 3));
    }
}