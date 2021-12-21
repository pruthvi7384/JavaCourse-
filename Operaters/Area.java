import java.lang.*;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        int a,b,c;
        float s;
        double area;
        System.out.println("Enter Three Size Of Traingle :");

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s = (a+b+c)/2f;

        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area of Triangle : "+area);

    }
}
