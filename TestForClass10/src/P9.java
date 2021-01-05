import java.util.*;
public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		String s=cin.next();
		try
		{
			System.out.println(bin2Dec(s));
		}
		catch(BinaryFormatException e)
		{
			System.out.println(e.getMessage());
		}

	}

	public static int bin2Dec(String s)throws BinaryFormatException
	{
		int res=0;

		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c!='1'&&c!='0') throw new BinaryFormatException("BinError");
			
			res=res*2+(int)(c-'0');

		}


		return res;

	}

}

class BinaryFormatException extends Exception
{
	public BinaryFormatException(String msg)
	{
		super(msg);
	}
}