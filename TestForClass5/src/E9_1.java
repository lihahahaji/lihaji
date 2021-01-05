
public class E9_1 {

	public static void main(String[] args) {
		SimpleCircle c1=new SimpleCircle(); 
		System.out.println("The area of the circle of radius "+ c1.radius + " is " + c1.getArea());
		
		SimpleCircle c2=new SimpleCircle(25);
		System.out.println("The area of the circle of radius "+ c2.radius + " is " + c2.getArea());
		
		SimpleCircle c3=new SimpleCircle(125);
		System.out.println("The area of the circle of radius "+ c3.radius + " is " + c3.getArea());
		
		c2.radius=100;
		c2.setRadius(100);
		System.out.println("The area of the circle of radius "+ c2.radius + " is " + c2.getArea());
		
	}

}

class SimpleCircle
{
	double radius;
	
	SimpleCircle()
	{
		this.radius=1;
	}
	
	SimpleCircle(double r)
	{
		this.radius=r;
	}
	
	double getArea()
	{
		return this.radius*this.radius*Math.PI;
	}
	
	double getPerimeter()
	{
		return 2*radius*Math.PI;
	}
	
	void setRadius(double x)
	{
		this.radius=x;
	}
}