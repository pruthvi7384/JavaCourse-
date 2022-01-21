public class GCD {
    static int gcd(int x, int y){
        while(x!=y){
            if(x>y){
                x = x - y;
            }else{
                y = y - x;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        int m = 25;
        int n = 15;
       ;
        System.out.println(gcd(m,n));
    }
}
