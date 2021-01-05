import java.util.Scanner;
public class Problem3_28 {

	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		System.out.print("Enter rl's center x-, y-coordinates, width, and height:");
		double x1=cin.nextDouble();
		double y1=cin.nextDouble();
		double w1=cin.nextDouble();
		double h1=cin.nextDouble();
		
		System.out.print("Enter rl's center x-, y-coordinates, width, and height:");
		double x2=cin.nextDouble();
		double y2=cin.nextDouble();
		double w2=cin.nextDouble();
		double h2=cin.nextDouble();
		
		double wi=(Math.abs(x2-x1)+w2/2);
		double he=(Math.abs(y2-y1)+h2/2);
		if(wi<=w1/2&&he<=h1/2)
		{
			System.out.println("r2 is inside r1");
		}
		else if(Math.abs(x2-x1)<=(w1+w2)/2||Math.abs(y2-y1)<=(h2+h2))
		{
			System.out.println("r2 overlaps r1");
		}
		else
		{
			System.out.println("r2 does not overlap r1");
		}

	}

}
