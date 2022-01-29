
public class DuplicateStringArray {

	public static void main(String[] args) 
	{
		// Find duplicate elements from the given string array
		
		String words[]= {"Java","C","C++","Ruby","Python","Java","Python"};
		
		for (int i=0;i<words.length;i++)
		{
			for (int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					System.out.println(words[i]);
				}
			}
		}

	}

}
