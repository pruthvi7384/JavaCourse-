import java.util.*;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Triangle Base :");
        float b = sc.nextFloat();
        System.out.println("Enter The Triangle Hight :");
        float h = sc.nextFloat();

        float area = (b*h)/2;

        System.out.println("Area Of Triangle : " +area);

    }
}
