
public class StringSwap {

	public static void main(String[] args) 
	{
		// Given the string a and b swap them witjout using a temporary string
		
		String a="Hello";
		String b="World";
		
		a=a+b;// a=HelloWorld
		b=a.substring(0, a.length()-b.length());
		a=a.substring(a.length()-b.length());
		
		System.out.println(a);
		System.out.println(b);
	}

}
