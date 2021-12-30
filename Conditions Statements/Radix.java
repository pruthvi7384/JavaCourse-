import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        String num;
        System.out.println("Enter Any Number ");

        Scanner sc = new Scanner(System.in);

        num = sc.nextLine();

        if(num.matches("[0-1]+")){
            System.out.println("Your Entered Number is Binary Number, Radix is = 2");
        }else if(num.matches("[0-7]+")){
            System.out.println("Your Entered Number is Octal Number, Radix is = 8");
        }else if(num.matches("[0-9]+")){
            System.out.println("Your Entered Number is Decimal Number, Radix is = 10");
        }else if(num.matches("[0-9A-F]+")){
            System.out.println("Your Entered Number is Hexa Decimal Number, Radix is = 16");
        }else{
            System.out.println("Your Enter Number Is Not Valid");
        }

    }
}
