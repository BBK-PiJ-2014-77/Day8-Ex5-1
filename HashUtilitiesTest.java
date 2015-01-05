import org.junit.Test;

import static org.junit.Assert.*;

public class HashUtilitiesTest {

    @Test
    public void testsshortHash1() {
        int input =  10;
        int output = HashUtilities.shortHash(input);
        int expected = 10;
        assertEquals(expected, output);
    }

    @Test
    public void testsshortHash2() {
        int input =  1000;
        int output = HashUtilities.shortHash(input);
        int expected = 0;
        assertEquals(expected, output);
    }

    @Test
    public void testsshortHash3() {
        int input =  1001;
        int output = HashUtilities.shortHash(input);
        int expected = 1;
        assertEquals(expected, output);
    }

    @Test
    public void testsshortHash4() {
        int input =  0;
        int output = HashUtilities.shortHash(input);
        int expected = 0;
        assertEquals(expected, output);
    }

    @Test
    public void testsshortHash5() {
        int input =  -1;
        int output = HashUtilities.shortHash(input);
        int expected = 1;
        assertEquals(expected, output);
    }

    @Test
    public void testshortHash6() {
        for (int i = 0 ; i <=2000 ; i++) {
            int input = (int) Math.ceil(Math.random())*10000;
            int output = HashUtilities.shortHash(input);
            assertTrue(output <= 1000 && output >= 0);

        }
    }

}