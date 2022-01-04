public class Multipication {
    public static void main(String[] args) {
        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
        int B[][]={{1,0,0},{0,1,0},{0,0,1}};
        int C[][] = new int[3][3];

        for(int i = 0; i<A.length; i++){
            for(int j =0; j<A[i].length; j++){
                C[i][j] = 0;
                for(int k = 0; k<A[i].length; k++){
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        for(int x[]:C)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }

    }
}
