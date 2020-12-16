import java.util.Scanner;
public class Problem3_29 {

	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		System.out.print("Enter Circle1's center x-, y-coordinates and radius:");
		double x1=cin.nextDouble();
		double y1=cin.nextDouble();
		double r1=cin.nextDouble();
		
		
		System.out.print("Enter Circle2's center x-, y-coordinates and radius:");
		double x2=cin.nextDouble();
		double y2=cin.nextDouble();
		double r2=cin.nextDouble();
		
		double dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		if(dis+r2<=r1)
		{
			System.out.println("circle2 is inside circle1");
		}
		else if(dis<=r1+r2)
		{
			System.out.println("circle2 overlaps circle1");
		}
		else
		{
			System.out.println("circle2 does not overlap circle1");
		}
		
	}

}
