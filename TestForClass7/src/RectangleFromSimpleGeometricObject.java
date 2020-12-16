
public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject
{
	private double width;
	private double height;
	
	public RectangleFromSimpleGeometricObject()
	{
		
	}
	
	public RectangleFromSimpleGeometricObject(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	
	public RectangleFromSimpleGeometricObject(double width,double height,String color,boolean filled)
	{
		this.width=width;
		this.height=height;
		super.setColor(color);
		super.setFilled(filled);
	}
	
	public double getwidth()
	{
		return this.width;
	}
	
	public void setWidth(double width)
	{
		this.width=width;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	public void setHeight(double height)
	{
		this.height=height;
	}
	
	public double getArea()
	{
		return this.height*this.width;
	}
	
	public double getPerimeter()
	{
		return 2*(this.width+this.height);
	}
}
