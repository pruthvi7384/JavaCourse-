import java.util.Scanner;

public class DisplayDigit {
    public static void main(String[] args) {
        int digit;

        System.out.println("Enter Any Digit");
        Scanner sc = new Scanner(System.in);

        digit = sc.nextInt();

        int r;

        while(digit>0){
            r = digit%10;
            digit = digit / 10;
            System.out.println(r);
        }
    }
}
