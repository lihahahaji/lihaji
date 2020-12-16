import java.util.Scanner;

public class Problem9_11 {

	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		System.out.print("Enter a,b,c,d,e,f:");
		double a=cin.nextDouble();
		double b=cin.nextDouble();
		double c=cin.nextDouble();
		double d=cin.nextDouble();
		double e=cin.nextDouble();
		double f=cin.nextDouble();
		
		LinearEquation l=new LinearEquation(a,b,c,d,e,f);
		if(l.isSolvable()==false) System.out.println("Error");
		else System.out.println(l.getX()+" "+l.getY());
		

	}

}

class LinearEquation
{
	private double a,b,c,d,e,f;
	LinearEquation(double a,double b,double c,double d,double e,double f)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
	}
	
	public boolean isSolvable()
	{
		return (a*d-b*c!=0);
	}
	
	public double getX()
	{
		return (e*d-b*f)/(a*d-b*c);
	}
	
	public double getY()
	{
		return (a*f-e*c)/(a*d-b*c);
	}
}