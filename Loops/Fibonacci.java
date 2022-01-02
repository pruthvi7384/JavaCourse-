import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a,b,n,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Fibonacci Series First Term");
        a = sc.nextInt();

        System.out.println("Enter The Fibonacci Series Second Term");
        b = sc.nextInt();

        System.out.println("Enter The Fibonacci Series Limit");
        n = sc.nextInt();
        System.out.print(a+" , "+b+" , ");
        for(int i = 0; i<n ; i++){
            c = a+b;
            System.out.print(c+" , ");

            a = b;
            b = c;
        }
    }
}
