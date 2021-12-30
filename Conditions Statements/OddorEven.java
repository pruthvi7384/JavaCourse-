import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        int a;

        System.out.println("Enter Any Number ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();

        if(a%2 == 0){
            System.out.println(a + " is Even Number");
        }else{
            System.out.println(a + " is Odd Number");
        }
    }
}
