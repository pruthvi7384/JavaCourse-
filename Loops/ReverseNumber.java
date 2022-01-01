import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n,r,rev=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number");

        n = sc.nextInt();

        while(n>0){
            r = n % 10;
            rev = rev*10+r;
            n = n / 10;
        }

        System.out.println("Reverse Number Is "+rev);
    }
}
