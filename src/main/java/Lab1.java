import java.util.ArrayList;

public class Lab1 {

    public int[][] Anticlockwise(int[][] array) {
        int[][] resultArray = new int[array[0].length][array.length];//
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultArray[array[i].length - j - 1][i] = array[i][j];
            }
        }
        return resultArray;
    }

    public ArrayList<Integer> PerfectNumbers (int tonumber) {
        ArrayList numbers = new ArrayList<Integer>();
        for (int i = 1; i < tonumber; i++) {
            int sum = 0;
            for (int n = 1; n < i; n++) {
                if (i%n == 0)
                    sum += n;
            }
            if (i == sum)
                numbers.add(i);
        }
        return numbers;
    }
}
