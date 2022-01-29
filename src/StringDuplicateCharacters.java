
public class StringDuplicateCharacters {

	public static void main(String[] args) 
	{
		// Find and print duplicate characters from given string
		
		String s="With great powers comes great responsibility";
		char let[]=s.toCharArray();
		
		for(int i=0;i<let.length;i++)
		{
			int count=1;
			for (int j=i+1;j<(let.length-1);j++)
			{
				if (let[i]==let[j] && let[i]!=' ')
				{
					count++;
					let[j]=0;
				}
			}
			if(count>1 && let[i]!=0)
			{
				System.out.println(let[i]+" is repeated "+count+"times");	
			}	
		}

	}

}
