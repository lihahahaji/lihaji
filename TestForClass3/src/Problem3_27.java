import java.util.Scanner;

public class Problem3_27 {

	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		System.out.print("Enter a point's x- and y-coordinates:");
		double x=cin.nextDouble();
		double y=cin.nextDouble();
		if(x>=0&&x<=200&&y>=0&&y<=100&&(0.5*x+y<=100))
		{
			System.out.println("The point is in the triangle.");
		}
		else
		{
			System.out.println("The point is not in the triangle.");
		}
		
	}

}
