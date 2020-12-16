
public class CircleWithStaticMembers {
	double radius;
	
	static int numberOfObjects=0;
	
	CircleWithStaticMembers()
	{
		this.radius=1;
		numberOfObjects++;
	}
	
	CircleWithStaticMembers(double newRadius)
	{
		this.radius=newRadius;
		numberOfObjects++;
	}
	
	static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	
	double getArea()
	{
		return this.radius*this.radius*Math.PI;
	}
	
}
