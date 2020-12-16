
public class Problem7_23 {
	public static void main(String[] args)
	{
		boolean[] box=new boolean[200];
		for(int i=1;i<=100;i++) box[i]=false;
		for(int i=2;i<=100;i++)
		{
			for(int j=i;j<=100;j+=i-1)
			{
				box[j]=!box[j];
			}
		}
		for(int i=1;i<=100;i++) System.out.println(box[i]);
	}

}
