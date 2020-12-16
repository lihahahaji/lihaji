
public class Problem9_10 {

	public static void main(String[] args) {
		

	}

}


class QuadraticEquation
{
	private double a,b,c;
	
	QuadraticEquation(double a,double b,double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double geta()
	{
		return this.a;
	}
	
	public double getb()
	{
		return this.b;
	}
	
	public double getc()
	{
		return this.c;
	}
	
	public double getDiscriminant()
	{
		return b*b-4*a*c;
	}
	
	public double getRoot1()
	{
		if(getDiscriminant()>=0)
		{
			return ((-b+Math.sqrt(getDiscriminant()))/(2*a));
		}
		else return 0;
	}
	
	public double getRoot2()
	{
		if(getDiscriminant()>=0)
		{
			return ((-b-Math.sqrt(getDiscriminant()))/(2*a));
		}
		else return 0;
	}
	
}