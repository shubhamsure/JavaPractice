
public class StringReverseWords {

	public static void main(String[] args) 
	{
		// Given a sentence ,reverse only its words and not the whole sentence
		String s="My name is Shubham";
		String words[]=s.split(" ");
		String rev="";
		
		for(String w:words)
		{
			String revw="";
			for(int i=w.length()-1;i>=0;i--)
			{
				revw=revw+w.charAt(i);
			}
			rev=rev+revw+" "; 
		}
		System.out.println(rev);

	}

}
