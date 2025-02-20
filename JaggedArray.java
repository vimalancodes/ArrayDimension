import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows need?");
        int inputRow = sc.nextInt();
        //int inputCol = 1;
        int[][] mat = new int[inputRow][];

        for (int i= 0; i<inputRow;i++){
            System.out.println("Enter how many columns u want " + (i+1) + " row");
             int inputCol =sc.nextInt();
             mat[i] = new int[inputCol]; 
             System.out.println("Enter what number you want in?" +(i+1) + " row");
           for (int j=0; j < inputCol;j++){
            mat[i][j]=sc.nextInt();
           }
        }
        for (int k= 0; k<mat.length;k++){
           for (int j=0; j < mat[k].length;j++){
            System.out.print(mat[k][j] + " ");
            }   
           System.out.println();
        }
    sc.close();
    }
}
 
