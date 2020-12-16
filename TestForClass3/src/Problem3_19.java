import java.util.Scanner;
public class Problem3_19 {

	public static boolean judge(int a,int b,int c)
	{
		if((a+b>c)&&(a+c>b)&&(b+c>a)) return true;
		else return false;
	}
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		int a=cin.nextInt();
		int b=cin.nextInt();
		int c=cin.nextInt();
		cin.close();
		if(judge(a,b,c)) System.out.println(a+b+c);
		else System.out.println("Illegal inputs");
	}

}
