import org.junit.Test;
import org.junit.runners.JUnit4;
import static org.junit.Assert.assertArrayEquals;
// TODO: Replace examples and use TDD by writing your own tests

public class PowersOfTwoTest {
    @Test
    public void testSomething() {
        assertArrayEquals(new long[]{1}, PowersOfTwo.powersOfTwo(0));
        assertArrayEquals(new long[]{1,2}, PowersOfTwo.powersOfTwo(1));
        assertArrayEquals(new long[]{1,2,4,8,16}, PowersOfTwo.powersOfTwo(4));
    }
}
