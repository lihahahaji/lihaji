import java.util.Scanner;
public class Problem7_34 {

	public static String sort(String s)
	{
		for(int i=0;i<s.length();i++)
	    {
	        int min=i;
	        for(int j=i;j<s.length();j++)
	        {
	            if((int)(s.charAt(j))<(int)(s.charAt(min)))
	            {
	                min=j;
	            }
	        }
	        char t=s.charAt(i);
	        StringBuilder stb=new StringBuilder(s);
	        stb.setCharAt(i,s.charAt(min));
	        stb.setCharAt(min,t);
	        s=stb.toString();
	    }
		return s;
	}
	
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		System.out.print("Enter a string:");
		
		String s=cin.next();
		String str=sort(s);
		System.out.println(str);
		

	}

}
