
public class FibbonaciSeries {

	public static void main(String[] args) 
	{
		// Print the fibbonaci series until the given number n  0,1,1,2,3,5,8,13,...
		int n=10;
		int n1=0,n2=1,n3;
		
		System.out.print(n1+","+n2);
		for (int i=2;i<n;i++)
		{
			n3=n1+n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;
		}
		

	}

}
