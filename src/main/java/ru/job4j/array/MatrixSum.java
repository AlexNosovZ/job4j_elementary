package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int result = 0;
        /* loops */
        for (int row = 0; row < array.length; row++) {
            for (int ceil = 0; ceil < array[row].length; ceil++) {
                result += array[row][ceil];
            }
        }
        return result;
    }
}
