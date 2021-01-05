import java.util.Scanner;
public class Problem7_3 {

	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		int[] cnt=new int[200];
		for(int i=0;i<=100;i++) cnt[i]=0;
		
		while(cin.hasNextInt())
		{
			int a=cin.nextInt();
			if(a==0) break;
			cnt[a]++;
		}
		
		for(int i=1;i<=100;i++)
		{
			if(cnt[i]!=0)
			{
				System.out.println(i+" occurs "+cnt[i]+" times");
			}
		}
	}
}
