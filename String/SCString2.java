public class SCString2 {
    public static void main(String[] args) {
        // int b=100110010;

        // String str = b + "";
        // String str = String.valueOf(b);

        // System.out.println(str.matches("[01]+"));

        // String str = "234AB";

        // System.out.println(str.matches("[0-9A-F]+"));

        String d = "01/12/2021";

        System.out.println(d.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}
