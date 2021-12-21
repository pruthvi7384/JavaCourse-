import java.lang.*;

class VariableRule 
{
	public static void main(String args[])
	{
		int X;
		int x;

		/*
			int a;
			int a;
		
			E:\Java\DataType>java VariableRule.java
                        VariableRule.java:11: error: variable a is already defined in method main(String[])
                        int a;
                           ^
                        1 error
			error: compilation failed
		*/
		
		/*
		int Roll Number;
			E:\Java\DataType>javac VariableRule.java
			VariableRule.java:22: error: ';' expected
                	int Roll Number;
                        	^
			VariableRule.java:22: error: not a statement
                	int Roll Number;
                        	 ^
			2 errors
		*/
		
		int Roll_Number;

		/*
		int 1x;
		
			E:\Java\DataType>javac VariableRule.java
			VariableRule.java:36: error: not a statement
                		int 1x;
               			 ^
			VariableRule.java:36: error: ';' expected
                		int 1x;
                   		  ^
			VariableRule.java:36: error: not a statement
                		int 1x;
                     		   ^
			3 errors
		*/

		int x1;
		int _x;
		int $x;

		/*
		int float;
		E:\Java\DataType>javac VariableRule.java
		VariableRule.java:56: error: not a statement
                	int float;
                	^
			VariableRule.java:56: error: ';' expected
                	int float;
                   	^
			VariableRule.java:56: error: not a statement
                	int float;
                    	   ^
			3 errors
		*/

		int rollNumberOf;
		int RollNumberOfStudent;
	}
}