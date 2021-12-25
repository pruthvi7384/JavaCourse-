public class StringPractice5 {
    public static void main(String[] args) {
        // String str1="abcdef";

        // System.out.println(str1.matches("[abc]*"));

        // String str1="accbdefg";

        // System.out.println(str1.matches("[abc]{3,7}"));

        String str1="john@gmail.com";

        // System.out.println(str1.matches(".*gmail.*"));

        System.out.println(str1.matches("\\w*@gmail(.*)"));
    }
}
