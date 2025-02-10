package Multidiensional_Array;

public class SumofMatrix {
    public static void main(String[] args) {
        
        int [][] MatrixA ={{1,2,3},{4,3,2},{2,2,2}};
        for(int i =0; i<MatrixA.length; i++)
        { 
            int sum=0;
            for(int j=0; j<MatrixA[0].length; j++){
               sum = sum +  MatrixA[i][j];
            }
            System.out.println("The Sum of columnn " + " "+sum);
        }
       for(int j =0; j<MatrixA.length; j++)
        {
            int sum=0;
            for (int i=0;i<MatrixA.length; i++){
                sum = sum + MatrixA[i][j];
            }
            System.out.println("The Sum of columnn "  +" "+sum);
        } 
    }
    
}
