public class IncreaseLength {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int B[] = new int [2 * A.length];

        for(int i = 0; i<A.length; i++){
            B[i] = A[i];
        }
        A=B;

        System.out.println("Length Of Array is "+A.length);
    }
}
