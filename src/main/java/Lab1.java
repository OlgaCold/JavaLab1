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
}
