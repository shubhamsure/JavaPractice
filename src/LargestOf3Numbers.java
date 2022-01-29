
public class LargestOf3Numbers {

	public static void main(String[] args) 
	{
		// Given 3 numbers n1,n2 and n3 find the largest among them
		int n1=-500,n2=-600,n3=30;
		if(n1>n2 && n1>n3)
		{
			System.out.println("Largest number is :"+n1);
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("Largest number is :"+n2);
		}
		else if(n3>n1 && n3>n2)
		{
			System.out.println("Largest number is :"+n3);
		}

	}

}
