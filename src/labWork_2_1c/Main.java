package labWork_2_1c;

import java.util.Arrays;

/**
 * Created by Bulik on 14.07.2016.
 */
public class Main {
    public static void main(String[] args) {

        Matrix matrix = new Matrix();
        int[][] matr_1 = {{1, 2}, {3, 4}};

        int[][] matr_2 = {{3, 3}, {-2, -2}};

        int[][] res = matrix.add(matr_1, matr_2);
        for (int[] row : res) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("---------------------");
        matrix.mult(matr_1, matr_2);
        res = matrix.getMatrix();
        for (int[] row : res) {
            System.out.println(Arrays.toString(row));

        }
    }
}