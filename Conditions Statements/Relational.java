import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter Three Number ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        if(a>b && a>c){
            System.out.println("The Maximum Number is " +a);
        }else if(b>c){
            System.out.println("The Maximum Number is " +b);
        }else{
            System.out.println("The Maximum Number is " +c);
        }
    }
}
