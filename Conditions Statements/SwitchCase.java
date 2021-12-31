import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        System.out.println("Choose Any Choose => 1 , 2 , 3");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // if(n==1){
        //     System.out.println("One");
        // }else if(n==2){
        //     System.out.println("Two");
        // }else if(n==3){
        //     System.out.println("Three");
        // }else{
        //     System.out.println("Not Valiad Number");
        // }

            switch(n){
                case 1 :
                    System.out.println("One");
                    break;
                case 2 :
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                default:
                    System.out.println("Please Enter Right Key");
            }
    }
}
