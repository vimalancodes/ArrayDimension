public class Threedmatrix {
    public static void main(String[] args) {
        int[][][] myMatrix = 
        {
            {
            {1,2,4},{5,6,7}
            },
            {
            {1,2,4},{5,6,7}
            }
};
    for (int i =0; i<myMatrix.length; ++i){
        for(int j=0; j<myMatrix[i].length; ++j){
            for(int k=0; k<myMatrix[i][j].length;++k){
                System.out.print(myMatrix[i][j][k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }  
}  
}
