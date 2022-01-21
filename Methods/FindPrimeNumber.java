
public class FindPrimeNumber {
    static boolean isPrime(int n)

    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int x = 89;
        isPrime(x);
        if(isPrime(x)){
            System.out.println("PRIME NUMBER");
        }else{
            System.out.println("NOT PRIME NUMBER");
        }
    }
}
