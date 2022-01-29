
public class NumberSwap {

	public static void main(String[] args) 
	{
		// Given 2 integers a and b swap them without using temporary variable
		int a=10;
		int b=5;
		
		a=a+b; //15
		b=a-b;//10
		a=a-b;//5
		
		System.out.println(a);
		System.out.println(b);

	}

}
