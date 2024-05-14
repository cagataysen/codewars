import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class FactorTest {
    @Test
    public void basicTests() {
        assertEquals(true, checkForFactor.checkForFactor(10, 2));
        assertEquals(true, checkForFactor.checkForFactor(63, 7));
        assertEquals(true, checkForFactor.checkForFactor(2450, 5));
        assertEquals(true, checkForFactor.checkForFactor(24612, 3));
    }
}