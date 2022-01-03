public class CopyArray {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        int B[] = new int [10];

        for(int x :A){
            System.out.print(x+", ");
        }

        System.out.println("");

        for(int i = 0; i<A.length; i++){
            B[i] = A[i];
        }

        for(int x :B){
            System.out.print(x+", ");
        }
    }
}
