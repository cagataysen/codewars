import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class reversedStringsTest {
    @Test
    public void sampleTests() {
        assertEquals("dlrow", reversedStrings.solution("world"));
    }
}