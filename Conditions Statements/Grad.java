import java.util.Scanner;

public class Grad {
    public static void main(String[] args) {
        int s1,s2,s3, total;

        float avg;

        System.out.println("Enter Your Any Three Subject Marks ");
        Scanner sc = new Scanner(System.in);

        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();

        total = s1+s2+s3;
        System.out.println("Your Total Marks " +total);

        avg = (float) total/3;
        System.out.println("Your Persentage is " +avg+ "%");

        if(avg >=70){
            System.out.println("Your Grade is A");
        }else if(avg >=60 && avg < 70){
            System.out.println("Your Grade is B");
        }else if(avg >=50 && avg < 60){
            System.out.println("Your Grade is C");
        }else if(avg >= 40 && avg < 50){
            System.out.println("Your Grade is D");
        }else {
            System.out.println("You Are Faill");
        }
    }
}
