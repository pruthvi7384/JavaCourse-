public class Inserting {
    public static void main(String[] args) {
        int A[]=new int[10];
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;

        for(int x :A){
            System.out.print(x+" , ");
        }

        System.out.println("");

        int n = 6;

        int value = 20;
        int index = 2;

        for(int i = n; i>index ;i--){
            A[i]=A[i-1];
        }
        A[index]=value;

        for(int x :A){
            System.out.print(x+" , ");
        }
    }
}
