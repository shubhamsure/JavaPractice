
public class StringCompression {

	public static void main(String[] args) 
	{
		// input String s="aaabbbccdd" 
		// output: a3b3c2d2
		
		String s="aaabbbccdd";
		StringBuffer sb=new StringBuffer();
		int count=1;
		for (int i=0;i<s.length();i++)
		{
			//if i reaches at the end then append all and break out of loop.
			if(i==s.length()-1)
			{
				sb.append(s.charAt(i)+""+count);
				break;
			}
			//if 2 successive characters are equal then increase the counter
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			//else append the characters with its count
			else
			{
				sb.append(s.charAt(i)+""+count);
				count=1;
			}
			
		}
		System.out.println(sb);
		

	}

}
