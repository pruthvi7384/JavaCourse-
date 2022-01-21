class MethodWriting {
    // static int max(int x, int y){
    //     if(x>y){
    //         return x;
    //     }else{
    //         return y;
    //     }
    // }

    static void inc(int x)
    {
        x++;
        System.out.println(x);
    }
    public static void main(String[] args) {
        // int a = 20, b=30, c;

        // // MethodWriting mp = new MethodWriting();
        // // c = mp.max(a, b);
        // c= max(a,b);
        // System.out.println(c);
        int a = 30;
        inc(a);
        System.out.println(a);
    }
}