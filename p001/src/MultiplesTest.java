import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplesTest {

    private Multiples multiplier;

    @Before
    public void setUp() {
        multiplier = new Multiples();
    }
    @Test
    public void testBelowTwoShouldReturn0() {
        multiplier.addMultiples(2);
        assertEquals(0, multiplier.answer());
    }

    @Test
    public void testBelowFourShouldReturn3() {
        multiplier.addMultiples(4);
        assertEquals(3, multiplier.answer());
    }

    @Test
    public void testBelowTenShouldReturn23() {
        multiplier.addMultiples(10);
        assertEquals(23, multiplier.answer());
    }

    @Test
    public void testBelow1000() {
        multiplier.addMultiples(1000);
        assertEquals(233168, multiplier.answer());
    }
}
