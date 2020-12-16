
public class PolymorphismDemo
{
	public static void main(String[] args)
	{
		displayObject(new CircleFromSimpleGeometricObject(1,"red",false));
		displayObject(new RectangleFromSimpleGeometricObject(1,1,"black",true));
	}
	
	public static void displayObject(SimpleGeometricObject object)
	{
		System.out.println("Created on "+object.getDateCreated()+".color is "+object.getColor());
	}
}

//继承关系使一个子类继承父类的特征，并且附加一些新特征。子类是它的父类的特殊 化，每个子类的实例都是其父类的实例，但是反过来就不成立。例如:每个圆都是一个几何 对象，但并非每个几何对象都是圆。因此，总可以将子类的实例传给需要父类型的参数。考 虑程序清单 11 5 中的代码。