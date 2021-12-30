import java.util.Scanner;

public class Positve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("Enter Any Number ");

        a = sc.nextInt();

        if(a >= 0){
            System.out.print(a + " is positve Number");
        }else{
            System.out.print(a + " is negative Number");
        }
    }
}
