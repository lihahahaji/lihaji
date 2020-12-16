
public class E9_2 {
	
	public static void main(String[] args)
	{
		E9_2 circle1=new E9_2();
		System.out.println("The area of the circle of radius "+ circle1.radius + " is " + circle1.getArea());
		
		E9_2 circle2=new E9_2(25);
		System.out.println("The area of the circle of radius "+ circle2.radius + " is " + circle2.getArea());
		
		E9_2 circle3=new E9_2(125);
		System.out.println("The area of the circle of radius "+ circle3.radius + " is " + circle3.getArea());
		
		circle2.radius=100;
		System.out.println("The area of the circle of radius "+ circle2.radius + " is " + circle2.getArea());
	}
	
	double radius;
	E9_2()
	{
		radius=1;
	}
	
	E9_2(double r)
	{
		this.radius=r;
	}
	
	double getArea()
	{
		return radius*radius*Math.PI;
	}
	
	void setRadius(double newRadius)
	{
		this.radius=newRadius;
	}
}
