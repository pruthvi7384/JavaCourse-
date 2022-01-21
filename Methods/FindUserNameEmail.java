public class FindUserNameEmail {
    static void username(String email){
        int a = email.indexOf('@');
        String userName = email.substring(0, a);
        System.out.println(userName);

    }
    public static void main(String[] args) {
        String name = "pruthviraj.rajput@gmail.com";
        username(name);
    }
}
