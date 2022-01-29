
public class PrimeNumber 
{
	// Find wheather the given number is Prime or not.
	public static boolean isPrime(int n)
	{
		if(n<2)
		{
			return false;
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) 
	{
		System.out.println(" Is 4 a Prime number ? "+isPrime(4));

	}

}
