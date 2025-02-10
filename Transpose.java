public class Transpose {
    public static void main(String[] args){
        int[] [] myMatrix = {{1,2,3},{2,2,2}};
        for(int i =0; i<myMatrix[0].length; i++){
            for(int j=0; j<myMatrix.length; j++){
                System.out.print(myMatrix[j][i]+ " ");
            }
            System.out.println();
        }
    }
}