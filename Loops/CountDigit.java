import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        int n, count=0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number");
        n = sc.nextInt();

        while(n>0){
            n = n / 10;
            count++;
        }

        System.out.println("Number Of Digit "+count);

    }
}
