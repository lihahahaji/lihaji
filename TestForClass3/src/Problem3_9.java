import java.util.Scanner;

public class Problem3_9
{

	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as Integer:");
		String num=cin.nextLine();
		int sum=0;
		for(int i=0;i<num.length();i++)
		{
			sum+=(num.charAt(i)-'0')*(i+1);
		}
		sum%=11;
		System.out.print(num);
		if(sum==10)
		{
			System.out.println("X");
		}
		else
		{
			System.out.println(sum);
		}
		
	}
}
