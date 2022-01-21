public class MaximumArray {
    static void maximum(int A[]){
        int max = A[0];
        for(int i = 0; i<A.length; i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        maximum(A);
    }
}
