import java.util.Scanner;

public class Problem3_23 {

	public static boolean judge(double x,double y)
	{
		if(Math.abs(x)<=5&&Math.abs(y)<=2.5) return true;
		else return false;
	}
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		System.out.print("Enter a point with two coorinates: ");
		double x=cin.nextDouble();
		double y=cin.nextDouble();
		if(judge(x,y)) System.out.println("Point ("+x+" , "+y+") is in the rectangle.");
		else System.out.println("Point ("+x+" , "+y+") is not in the rectangle.");

	}

}
