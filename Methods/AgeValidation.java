public class AgeValidation {
    static boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }
    
    
    static boolean validate(int age)
    {
        return age>=3 && age<=15;
    }    
    public static void main(String[] args) {
        int a = 25;
        System.out.println(validate(a));
        System.out.println(validate("Name"));
    }
}
