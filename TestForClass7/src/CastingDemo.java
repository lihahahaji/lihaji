
public class CastingDemo {

	public static void main(String[] args)
	{
		Object object1=new CircleFromSimpleGeometricObject(1);
		Object object2=new RectangleFromSimpleGeometricObject(1,1);
		displayObject(object1);
		displayObject(object2);
	}
	public static void displayObject(Object object)
	{
		if(object instanceof CircleFromSimpleGeometricObject)
		{
			System.out.println("The circle area is "+((CircleFromSimpleGeometricObject)object).getArea());

		}
		else if(object instanceof RectangleFromSimpleGeometricObject)
		{
			System.out.println("The Rectangle area is "+((RectangleFromSimpleGeometricObject)object).getArea());
		}
	}
}
