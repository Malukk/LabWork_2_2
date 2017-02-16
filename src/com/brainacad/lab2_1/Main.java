package com.brainacad.lab2_1;

        import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Matrix m = new Matrix();
        int[][] arr = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 50);

            }
        }
        System.out.println("ARR");
        for (int[] rowArrey : arr) {

            System.out.println(Arrays.toString(rowArrey));
        }

        System.out.println();

        int[][] arr1 = new int[2][2];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr1[i][j] = (int) (Math.random() * 50);

            }
        }
        System.out.println("ARR1");
        for (int[] rowArrey : arr1) {
            System.out.println(Arrays.toString(rowArrey));
        }

        System.out.println();

        int[][] arr2 = new int[2][2];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[i][j] = (arr[i][j] + arr1[i][j]);


            }
        }
        System.out.println(" ARR+ ARR1");
        for (int[] rowArrey : arr2) {
            System.out.println(Arrays.toString(rowArrey));

        }
        System.out.println();
        int[][] arr3 = new int[2][2];
        arr3[0][0] = ((arr[0][0] * arr1[0][0]) + (arr[0][1] * arr1[1][0]));
        arr3[0][1] = ((arr[0][0] * arr1[0][1]) + (arr[0][1] * arr1[1][1]));
        arr3[1][0] = ((arr[1][0] * arr1[0][0]) + (arr[1][1] * arr1[1][0]));
        arr3[1][1] = ((arr[1][0] * arr1[0][1]) + (arr[1][1] * arr1[1][1]));
        System.out.println(" ARR * ARR1");
        for (int[] rowArrey : arr3) {
            System.out.println(Arrays.toString(rowArrey));

        }
    }
}