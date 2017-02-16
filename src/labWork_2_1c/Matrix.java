package labWork_2_1c;

/**
 * Created by Bulik on 14.07.2016.
 */
public class Matrix {

    private  int [][] matrix;
    public int[][] getMatrix() {

        return matrix;
    }
public  int [][] add(int[][] a, int[][] b){
    int [][] result = new int[a.length][b.length];
    for (int i = 0; i<result.length; i++){
        for (int j = 0; j<result[i].length; j++){
         result[i][j] =a[i][j] + b[i][j];
        }
    }
    return result;
    }
    public void  mult(int[][] a, int [][] b){
        matrix = new int[a.length][b.length];

        for (int i=0; i < matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                int sum = 0;
                for (int k = 0; k<a.length; k++){
                    sum +=a[i][k]*b[k][j];
                }
                matrix[i][j]=sum;
            }
        }
    }
}
