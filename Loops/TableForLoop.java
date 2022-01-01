import java.util.Scanner;

public class TableForLoop {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number You Want Table");

        n = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.printf("%d X %d = %d \n", n,i,(n*i));
        }

    }
}
