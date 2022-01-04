public class TwoDimantionArray {
    public static void main(String[] args) {
        //Creating Array of size 5X5
        int A[][]=new int[5][5];

        //Creating 2D array for size 5X5
        int B[][];
        B=new int[5][5];
        
        int [][]C=new int[5][5];
        int []D[]=new int[5][5];

        //E is a 2D array and F is a 1D array
        int[] E[],F;
        E=new int[5][5];
        F=new int[5];
        
        //G H and I are 1D arrays
        int[] G,H,I;

        //Creating and initialising array of size 3X4
        int M[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        for(int i = 0; i<M.length; i++){
            for(int j = 0; j<M[i].length; j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println("");
        }

        for(int x[]: M){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }

        //Jagged Array
        int X[][];
        X=new int[3][];
        
        X[0]=new int[5];
        X[1]=new int[3];
        X[2]=new int[8];

        for(int i = 0; i<X.length; i++){
            for(int j = 0; j<X[i].length; j++){
                System.out.print(X[i][j]+" ");
            }
            System.out.println("");
        }

        for(int x[]: X){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
