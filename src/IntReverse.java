
public class IntReverse {

	public static void main(String[] args) 
	{
		// reverse the given integer value
		
		int num=1234;
		int r;
		int revnum=0;
		
		while(num>0)
		{
			r=num%10;
			revnum=(revnum*10)+r;
			num=num/10;
		}
		System.out.println(revnum);

	}

}
