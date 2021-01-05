
public class CircleFromSimpleGeometricObject extends SimpleGeometricObject
{
	private double radius;
	public CircleFromSimpleGeometricObject()
	{
		
	}
	
	public CircleFromSimpleGeometricObject(double radius)
	{
		this.radius=radius;
	}
	
	public CircleFromSimpleGeometricObject(double radius,String color,boolean filled)
	{
		this.radius=radius;
		super.setColor(color);
		super.setFilled(filled);
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	
	public double getArea()
	{
		return Math.PI*this.radius*this.radius;
	}
	
	public double getPerimeter()
	{
		return 2*this.radius*Math.PI;
	}
	
	public void printCircle()
	{
		System.out.println("The circle is created "+super.getDateCreated()+"and the radius is "+this.radius);
	}
}
