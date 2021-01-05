import java.util.*;
public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		String s=cin.next();
		try
		{
			System.out.println(hex2Dec(s));
		}
		catch(HexFormatException e)
		{
			System.out.println(e.getMessage());
		}

	}

	public static int hex2Dec(String s)throws HexFormatException
	{
		int res=0;
		for(int i=0;i<s.length();i++)
		{
			if(!((s.charAt(i)>='A'&&s.charAt(i)<='F')||(s.charAt(i)>='0'&&s.charAt(i)<='9')))
			{
				throw new HexFormatException("HexError");
			}
			char c=s.charAt(i);
			int tmp=(c<='9'&&c>=0)?(int)(c-'0'):(int)(c-'A'+10);
			res=res*16+tmp;
		}
		return res;
	}

}

class HexFormatException extends Exception
{
	public HexFormatException(String msg)
	{
		super(msg);
	}
}