
public class SortingArray {

	public static void main(String[] args) 
	{
		// sort the given array 
		int num[]= {4,2,1,5,3};
		
		int len=num.length;
		
		for (int i=0;i<len-1;i++)
		{
			for (int j=0;j<len-1;j++)
			{
				if(num[j]>num[j+1])
				{
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}

	}

}
