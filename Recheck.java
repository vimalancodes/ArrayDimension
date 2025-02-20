import java.util.Scanner;

public class Recheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter how many rows you want:");
        int rows = sc.nextInt();
        int[] [] matrix = new int[rows][];
        for (int i=0; i<rows; i++){
            System.out.println("Enter how many columns you want? ");
            int columns = sc.nextInt();
            matrix[i] = new int[columns];
            for(int j=0; j<columns; j++){
            System.out.println("Enter the values you want in the columns :");
            matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){
            for (int j=0; j<matrix[i].length;j++){
            System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }

}
