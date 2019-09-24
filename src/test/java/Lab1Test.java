import org.junit.Test;

import static org.junit.Assert.*;

public class Lab1Test {

    @Test
    public void anticlockwise() throws Exception {

        Lab1 test = new Lab1();
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] actual = test.Anticlockwise(arr);
        int[] expected1 = {3, 6, 9};
        int[] expected2 = {2, 5, 8};
        int[] expected3 = {1, 4, 7};

        assertArrayEquals(expected1, actual[0]);
        assertArrayEquals(expected2, actual[1]);
        assertArrayEquals(expected3, actual[2]);

    }
}