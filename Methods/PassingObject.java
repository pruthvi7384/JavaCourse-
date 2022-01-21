class PassingObject{
    static void update(int A[],int index,int value){
        A[index] = value;
    }

    static void change(int x, int value){
        x = value;
    }
    public static void main(String[] args) {
        int A[] = {2,3,4,5,6,7};
        System.out.println("Before");
        for (int i : A) {
            System.out.println(i);
        }
        System.out.println("After");
        update(A,2,20);
        for (int i : A) {
            System.out.println(i);
        }

        int x=10;
        
        change(x,20);
        
        System.out.println("Value of primitive "+x);
    }
}