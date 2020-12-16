import java.util.Scanner;
public class problem7_5 {

	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		int cnt=0;
		int[] arr=new int[20];
		
		for(int i=0;i<10;i++)
		{
			int a;
			a=cin.nextInt();
			
			boolean flag=true;
			for(int j=0;j<cnt;j++)
			{
				if(arr[j]==a)
				{
					flag=false;
					break;
				}
			}
			if(flag) arr[cnt++]=a;
		}
		
		System.out.println("The number of distinct number is "+cnt);
		System.out.print("The distinct numbers are: ");
		for(int i=0;i<cnt;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		

	}

}
