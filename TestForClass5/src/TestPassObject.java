
public class TestPassObject {

	public static void main(String[] args) {
		CircleWithPrivateDataFields myCircle=new CircleWithPrivateDataFields(1);
		
		int n=5;
		printAreas(myCircle,n);
	}
	
	public static void printAreas(CircleWithPrivateDataFields c,int times)
	{
		while(times>=1)
		{
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius()+1);
			times--;
		}
	}
}
