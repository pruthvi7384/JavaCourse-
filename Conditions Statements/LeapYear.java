import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;

        System.out.println("Enter Year Number ");

        Scanner sc = new Scanner(System.in);

        year = sc.nextInt();

        if(year%4 == 0){
            if(year%100 ==0){
                if(year%400 ==0){
                    System.out.println("Your Entered Year is Leap Year");
                }else{
                    System.out.println("Your Entered Year is Not Leap Year");
                }
            }else{
                System.out.println("Your Entered Year is Leap Year");
            }
        }else{
            System.out.println("Your Entered Year is not Leap Year");
        }
    }
}
