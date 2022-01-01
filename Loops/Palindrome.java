import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n, r, rev=0, m;

        System.out.println("Enter Any Number");

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        m = n;

        while(n>0){
            r = n % 10;
            rev = rev*10+r;
            n = n / 10;
        }

        if(rev == m){
            System.out.println("Your Enter Number Is Palindrome");
        }else{
            System.out.println("Your Enter Number Is Not Palindrome");
        }

    }
}
