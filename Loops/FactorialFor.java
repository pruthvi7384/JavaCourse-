import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        int n;

        System.out.println("Enter The Number For Finding Factorial");

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int fact = 1;

        for(int i = 1; i<=n;i++){
            fact = fact * i;
        }

        System.out.println("Factorial of "+n+ " is "+fact);
    }
}
