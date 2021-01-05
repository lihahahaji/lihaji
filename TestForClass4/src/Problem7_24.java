import java.util.Random;
public class Problem7_24 {

	public static void main(String[] args)
	{
		Random r=new Random();
		
		String[] name= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		String[] flower= {"Spades","Clubs","Hearts","Diamonds"};
		Boolean[] flowerFlag= {false,false,false,false};
		int cnt=0;
		int tot=0;
		while(true)
		{
			cnt++;
			int num=1+r.nextInt(52);
			if(flowerFlag[num%4]==false)
			{
				tot++;
				flowerFlag[num%4]=true;
				System.out.println(name[num/4]+" of "+flower[num%4]);
			}
			if(tot==4)
			{
				break;
			}
		}
		System.out.println("Number of picks:"+cnt);
	}
}
