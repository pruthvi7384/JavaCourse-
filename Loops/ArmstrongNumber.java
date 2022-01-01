import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n,m, sum=0, r;

        System.out.println("Enter Any Number");

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        m=n;

        while(n>0){
            r = n % 10;
            n = n / 10;

            sum = sum + r*r*r;
        }
        if(sum == m){
            System.out.println("Its a Armstrong Number");
        }else{
            System.out.println("Its not an Armsttrong Number");
        }
    }
}
