import java.util.*;
public class P6 {

	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		String s=cin.next();
		try
		{
			System.out.println(hexToDec(s));
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}

	}

	public static int hexToDec(String s)throws NumberFormatException
	{
		int res=0;
		for(int i=0;i<s.length();i++)
		{
			if(!((s.charAt(i)>='A'&&s.charAt(i)<='F')||(s.charAt(i)>='0'&&s.charAt(i)<='9')))
			{
				throw new NumberFormatException("Error");
			}
			char c=s.charAt(i);
			int tmp=(c<='9'&&c>=0)?(int)(c-'0'):(int)(c-'A'+10);
			res=res*16+tmp;
		}
		return res;
	}

}
