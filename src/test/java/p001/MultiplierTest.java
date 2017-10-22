package p001;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplierTest {

    @Test
    public void testTwoNumbers() {
        Multiplier multi = new Multiplier();
        multi.multiply  (1,2);
        assertEquals(multi.answer(), 2);
    }
}
