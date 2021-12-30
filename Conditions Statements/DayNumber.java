import java.util.Scanner;

public class DayNumber {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter The Day Number");

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        if(num == 1){
            System.out.println("Mon");
        }else if(num == 2){
            System.out.println("Tue");
        }else if(num == 3){
            System.out.println("Wed");
        }else if(num == 4){
            System.out.println("Thur");
        }else if(num == 5){
            System.out.println("Fri");
        }else if(num == 6){
            System.out.println("Sat");
        }else if(num == 7){
            System.out.println("Sun");
        }else{
            System.out.println("Invaliad Day Number");
        }
    }
}
