import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class HighTest {
    @Test
    public void sampleTests() {
        assertEquals("taxi", High.high("man i need a taxi up to ubud"));
        assertEquals("volcano", High.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", High.high("take me to semynak"));
    }

    @Test
    public void edgeCaseTests() {
        assertEquals("aa", High.high("aa b"));
        assertEquals("b", High.high("b aa"));
        assertEquals("bb", High.high("bb d"));
        assertEquals("d", High.high("d bb"));
        assertEquals("aaa", High.high("aaa b"));
    }
}