package utils;

public class SwapNumbersInArray {

    public static void swap(int[] array, int index1, int index2) {
        int value = array[index1];
        array[index1] = array[index2];
        array[index2] = value;
    }

    public static void swap(int[][] array,int i, int j, int index1, int index2) {
        int value = array[i][j];
        array[index1][index2] = array[index2][index1];
        array[index2][index1] = value;
    }
}
