import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args)
	{
		// Check wheather the given string is an anagram or not 
		System.out.println("Are the given strings anagrams ? "+isAnagram("listen","silent"));
		
	}
	public static boolean isAnagram(String s,String s1)
	{
		char a[]=s.toCharArray();
		char b[]=s1.toCharArray();
		
		int a1=a.length;
		int b1=b.length;
		
		if(a1!=b1)
		{
			return false;
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i=0;i<a1;i++)
		{
			if(a[i]!=b[i])
			{
				return false;
			}
		}
		return true;
	}

}
