import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        int a, r, term, n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The G.P First Term");
        a = sc.nextInt();

        term = a;

        System.out.println("Enter The G.P Comman Ratio");
        r = sc.nextInt();

        System.out.println("Enter The Limit Of G.P Series");
        n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.print(term+" , ");
            term = term * r;
        }
    }
}
