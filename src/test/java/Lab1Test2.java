import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Lab1Test2 {

    @Test
    public void perfectNumbers() {
        Lab1 test2 = new Lab1();

        ArrayList<Integer> actual = test2.PerfectNumbers(10);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(6);

        assertEquals(expected, actual);

    }
}