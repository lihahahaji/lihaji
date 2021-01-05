import java.util.Scanner;
import java.util.Random;
public class Problem3_15
{
	public static void main(String[] args)
	{
		Random r=new Random();
		Scanner cin=new Scanner(System.in);
		
		int valueOfLottery=r.nextInt(900)+100;
//		System.out.println("The lucky number is "+valueOfLottery);
		System.out.print("Enter a three-digit integer:");
		int valueOfPlayer=cin.nextInt();
		cin.close();
		System.out.println("The lucky number is "+valueOfLottery);
		if(valueOfPlayer==valueOfLottery)
		{
			System.out.println("10000");
		}
		else
		{
			boolean[] map=new boolean[20];
			for(int i=0;i<=9;i++)
			{
				map[i]=false;
			}
			while(valueOfLottery>0)
			{
				map[valueOfLottery%10]=true;
				valueOfLottery/=10;
			}
			int cnt=0;
			while(valueOfPlayer>0)
			{
				int tmp=valueOfPlayer%10;
				if(map[tmp]==true)
				{
					cnt++;
				}
				valueOfPlayer/=10;
			}
			if(cnt==3)
			{
				System.out.println("3000");
			}
			else if(cnt>=1)
			{
				System.out.println("1000");
			}
			else System.out.println("NONE");
		}
		System.exit(0);
	}

}
