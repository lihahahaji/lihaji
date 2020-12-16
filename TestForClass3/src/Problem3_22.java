import java.util.Scanner;

public class Problem3_22 {

	public static boolean judge(double x,double y)
	{
		if(Math.sqrt(x*x+y*y)<=10.0) return true;
		else return false;
	}
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		System.out.print("Enter a point with two coorinates: ");
		double x=cin.nextDouble();
		double y=cin.nextDouble();
		if(judge(x,y)) System.out.println("Point ("+x+" , "+y+") is in the circle.");
		else System.out.println("Point ("+x+" , "+y+") is not in the circle.");

	}

}
