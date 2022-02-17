class reactangle{
    public double length;
    public double breadth;

    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2*(length + breadth);
    }
    public boolean squere(){
        if(length == breadth)
            return true;
        else
            return false;
    }
}
public class Rectangle{
    public static void main(String[] args) {
        reactangle r1 = new reactangle();
        r1.length = 10.5;
        r1.breadth = 9.5;

        System.out.println("Area "+ r1.area());
        System.out.println("Perimeter "+ r1.perimeter());
        System.out.println("Is It Squere "+ r1.squere());
    }
}