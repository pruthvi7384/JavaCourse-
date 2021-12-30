import java.util.Scanner;

public class Young {
    public static void main(String[] args) {
        int age;

        System.out.println("Enter Your Age ");

        Scanner sc = new Scanner(System.in);

        age = sc.nextInt();

        if(age>=14 && age <=55){
            System.out.println("Your Are Young");
        }else{
            System.out.println("Your Are Not Young");
        }
    }
}
