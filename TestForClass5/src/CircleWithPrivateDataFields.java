
public class CircleWithPrivateDataFields {
	private double radius=1;
	private static int numberOfObjects=0;
	
	public CircleWithPrivateDataFields(double newRadius)
	{
		this.radius=newRadius;
		numberOfObjects++;
	}
	
	public CircleWithPrivateDataFields()
	{
		numberOfObjects++;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public void setRadius(double newRadius)
	{
		this.radius=newRadius;
	}
	
	public double getArea()
	{
		return this.radius*this.radius*Math.PI;
	}
	
	public static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	
}
