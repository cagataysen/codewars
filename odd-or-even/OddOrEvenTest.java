import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class OddOrEvenTest {
    @Test
    public void exampleTest() {
        assertEquals("odd", OddOrEven.oddOrEven(new int[] {2, 5, 34, 6}));
    }
}