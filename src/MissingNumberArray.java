
public class MissingNumberArray {

	public static void main(String[] args) 
	{
		// Given two array's A & B array B has a missing number in it. find it. 
		
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,40,50};
		
		int suma=0;
		int sumb=0;
		int miss;
		
		for(int i=0;i<a.length;i++)
		{
			suma=suma+a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			sumb=sumb+b[i];
		}
         miss=suma-sumb;
         System.out.println(miss);
	}

}
