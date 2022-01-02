// Import Scanner From Util Package
import java.util.Scanner;

public class AP {
    public static void main(String[] args) {

        // Variable Intialization
        int a,d,n,term;

        // For Keboard Input Scanner Used
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Term Of A.P Series");
        a = sc.nextInt();

        term = a;

        System.out.println("Enter A.P Series Differance");
        d = sc.nextInt();

        System.out.println("Enter Limit Of A.p Series");
        n = sc.nextInt();

        for(int i = 0; i<n; i++){

            System.out.print(term+ " , ");
            term = term + d;
           
        }

    }
}
