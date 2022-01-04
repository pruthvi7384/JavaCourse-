public class MatrixAddition {
    public static void main(String[] args) {
        int A[][]={{1,2},{1,2}};
        int B[][]={{1,2},{1,2}};
        
        int C[][]=new int[2][2];
        
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
               C[i][j]=A[i][j]+B[i][j];
               System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
