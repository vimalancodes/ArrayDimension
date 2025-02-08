package Multidiensional_Array;

public class MatrixMultiplication {
    public static void main(String[] args){
        int[][] matrixA = {{1,2,1},{1,2,1},{4,5,1}};
        int[][] matrixB = {{2,1},{2,1},{3,5}};
        int[][] result = new int[3][2];
        for (int i=0;i<matrixA.length;++i){
            for(int j=0;j<matrixB[0].length;++j){
                for (int k=0;k<matrixA[0].length;++k){
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
    for (int[] rows : result) {
        for (int values : rows){
            System.out.print(values + " ");
        }
        System.out.println();   
    }
    }  
}
