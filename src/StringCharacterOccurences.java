
public class StringCharacterOccurences {

	public static void main(String[] args) 
	{
		// Find occurences of given character in given stirng
		// for example given a string "Shubham" find how many times character h has appeared in string.
		
		String s="Shubham";
		String s1=s.replace("h", "");
		System.out.println("The character h has appeared :"+(s.length()-s1.length())+" times");
		

	}

}
