import java.lang.*;

class Literal 
{
	public static void main(String args[])
	{
		
		/*
		byte x1 = 10;
		byte x2 = 0b1010;
		byte x3 = 012;
		byte x4 = 0XA;

		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);

		E:\Java\DataType>javac Literal.java

		E:\Java\DataType>java Literal
		10
		10
		10
		10
		*/
	
		long l = 99999999L;

		System.out.println(l);
		
		/*
		float f = 20.50;

		System.out.println(f);

			
		E:\Java\DataType>javac Literal.java
		Literal.java:32: error: incompatible types: possible lossy conversion from double to float
                float f = 20.50;
                          ^
		1 error
		*/
	
		float f = 20.50F;
		System.out.println(f);

		double d = 25.5050D;
		System.out.println(d);
	}
}