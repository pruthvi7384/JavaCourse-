import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Enter Number For Serching");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i :A){
            if(n == A[i]){
                System.out.println("Element Found at :"+i);
                System.exit(0);
            }
        }
        System.out.println("Not found");
    }
}
