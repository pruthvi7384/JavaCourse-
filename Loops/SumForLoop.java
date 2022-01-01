import java.util.Scanner;

public class SumForLoop {
    public static void main(String[] args) {
        int start,end;

        Scanner sc = new Scanner(System.in);

        System.out.println("Sum Of Number");

        System.out.println("Enter Starting Number");
        start = sc.nextInt();

        System.out.println("Enter Ending Number");
        end = sc.nextInt();

        int sum = 0;

        for(int i = start;i<=end;i++){
            sum = sum + i;
        }

        System.out.println("Sumation => " +sum);
    }
}
