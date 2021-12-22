public class WideNarrowDemo {
    public static void main(String[] args) {
        byte b=10;
        short s=10;
        int i=10;
        long l=10;
        float f=10;
        double d=10;
        char c=10;
        boolean bl=true;

        // s = b;
        // i = b;
        // l = b;
        // f = b;
        // d = b;

        // b = (byte)s;
        // i = s;
        // l =s;
        // f = s;
        // d = s;
        
        i = (int)f;
        f = i;
        d = f;
        f = (float)d;
    }
}
