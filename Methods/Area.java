public class Area {
    static double area(double radius)
    {
        return Math.PI*radius*radius;
    }
    
    static double area(double length,double breadth)
    {
        return length*breadth;
    }
    public static void main(String[] args) {
        area(25);
        System.out.println(area(25));
        System.out.println(area(30, 25));
    }
}