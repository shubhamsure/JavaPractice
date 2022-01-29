
public class StringCountWords {

	public static void main(String[] args) 
	{
		// Given a String of a sentence find how many words it contains. 
		
		String s= "Java is a programming langauge";
		int len=s.length();
		int count=1;
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println("There are "+count+" words in given string");

	}

}
