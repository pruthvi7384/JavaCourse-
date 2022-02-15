public class VariableArgument {
    // static void show(int ...A){
    //     for(int x:A){
    //         System.out.println(x);
    //     }
    // }

    static void showList(int start ,String ...s){
        for(int i = 0; i<s.length; i++){
            System.out.println(start+". "+s[i]);
            start++;
        }
    }
    public static void main(String[] args) {
        // show();
        // show(10,20,30);
        // show(new int[]{3,2,5,5,5,5,5});
        showList(1,"John", "Smith", "Ajay","Ahmed");
    }
}
