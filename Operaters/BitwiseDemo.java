public class BitwiseDemo {
   public static void main(String[] args) {
        // int x = 10, y = 6, z;
        // z = x&y;
        // System.out.println(z);
        // System.out.println(String.format("%s", Integer.toBinaryString(z)));

        // int x = 0b1010;
        // int y = 0b0110;
        // int z;

        // z = x&y;
        // z = x | y;
        // z = x ^ y;
        // z = x>>1;
        // System.out.println(z);
        // System.out.println(String.format("%s", Integer.toBinaryString(z)));

        // int x=0b1000;
        // int y;
        // y = x<<1; 
        // y = x<<2;
        //  y = x>>1; 
        // y = x>>2;
        // System.out.println(y);
        // System.out.println(String.format("%32s", Integer.toBinaryString(x)));
        // System.out.println(String.format("%32s", Integer.toBinaryString(y)));

        int x=-0b1010; //try with + and -
        int y;
        y=x>>1; //~x
        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(String.format("%s",Integer.toBinaryString(y)));
    }
}
