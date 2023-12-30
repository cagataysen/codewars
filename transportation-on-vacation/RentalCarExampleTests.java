import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RentalCarExampleTests {
    @Test
    public void under3Tests() {
        assertEquals(40, rentalCarExample.rentalCarCost(1));
        assertEquals(80, rentalCarExample.rentalCarCost(2));
    }

    @Test
    public void under7Tests() {
        assertEquals(100, rentalCarExample.rentalCarCost(3));
        assertEquals(140, rentalCarExample.rentalCarCost(4));
        assertEquals(180, rentalCarExample.rentalCarCost(5));
        assertEquals(220, rentalCarExample.rentalCarCost(6));
    }

    @Test
    public void over7Tests() {
        assertEquals(230, rentalCarExample.rentalCarCost(7));
        assertEquals(270, rentalCarExample.rentalCarCost(8));
        assertEquals(310, rentalCarExample.rentalCarCost(9));
        assertEquals(350, rentalCarExample.rentalCarCost(10));
    }
}