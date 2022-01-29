
public class StringPalindrome {

	public static void main(String[] args) 
	{
		// Check wheather the given string is palindrome or not
		String s="Nayan";
		String rev="";
int len=s.length();
		
		for (int i=len-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		if (s.equalsIgnoreCase(rev)) 
		{
			System.out.println("The Given String "+s+" is a palindrome");
		}
		else
		{
			System.out.println("The Given String "+s+" is not a palindrome");
		}
			

	}

}
