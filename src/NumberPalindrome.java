
public class NumberPalindrome {

	public static void main(String[] args) 
	{
		// Check wheather the given number is a palindrome or not
		int num=121;
		int n=num;
		int r;
		int revnum=0;
		
		while(num>0)
		{
			r=num%10;
			revnum=(revnum*10)+r;
			num=num/10;
		}
		System.out.println(revnum);
		
		if(n==revnum)
		{
			System.out.println("The given number "+n+ " is a plaindrome");
		}
		else
		{
			System.out.println("The given number "+n+ " is not a plaindrome");
		}

	}

}
