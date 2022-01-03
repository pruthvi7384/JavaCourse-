public class LargestNumber {
    public static void main(String[] args) {
        int A[] = {10,20,30,40,50,60,100};

        int max1, max2;

        max1=max2=A[0];

        for(int i = 0; i<A.length; i++){
            if(A[i] > max1){
                max2 = max1;
                max1 = A[i];
            }else if (A[i] > max2){
                max2 = A[i];
            }
        }
        System.out.println("Second Largest is "+max2);
    }
}
