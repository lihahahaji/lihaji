import java.util.Scanner;

public class Problem3_24 {

	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		System.out.print("Choose your card:");
		int num=cin.nextInt();
		
		String[] cardNum=new String[20];
		cardNum[0]="Ace";
		cardNum[1]="2";
		cardNum[2]="3";
		cardNum[3]="4";
		cardNum[4]="5";
		cardNum[5]="6";
		cardNum[6]="7";
		cardNum[7]="8";
		cardNum[8]="9";
		cardNum[9]="10";
		cardNum[10]="Jack";
		cardNum[11]="Queen";
		cardNum[12]="King";
		
		String[] cardFlower=new String[10];
		cardFlower[0]="Clubs";
		cardFlower[1]="Diamonds";
		cardFlower[2]="Hearts";
		cardFlower[3]="Spades";
		num--;
		int n=num/4;
		int f=num%4;
		System.out.println("The card you picked is "+cardNum[n]+" of "+cardFlower[f]);
	}

}
