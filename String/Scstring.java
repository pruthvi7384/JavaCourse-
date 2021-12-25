
public class Scstring {
    public static void main(String[] args) {
        String str="programmer@gmail.com";

        int i = str.indexOf("@");

        System.out.println(i);

        String userName = str.substring(0, i);

        System.out.println("Email Id is " +userName);

        String domain = str.substring(i+1, str.length());

        System.out.println("Domain Name Is " +domain);

        System.out.println(domain.startsWith("gmail"));
        // System.out.println(str.matches(".*gmail.*"));

        // int j = domain.indexOf(".");
        // String name = domain.substring(0, j);

        // System.out.println(name.equals("gmail"));
    }
}