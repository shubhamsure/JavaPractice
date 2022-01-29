
public class SmallLargeArray {

	public static void main(String[] args) 
	{
		// Find smallest and largest number from given array
		
		int num[]= {10,20,30,40,50};
		int smallest=num[0];
		int largest=num[0];
		
		for (int i=0;i<num.length;i++)
		{
			if (num[i]>largest)
			{
				largest=num[i];
			}
			else if(num[i]<smallest)
			{
				smallest=num[i];
			}
		}
		System.out.println(smallest);
		System.out.println(largest);

	}

}
