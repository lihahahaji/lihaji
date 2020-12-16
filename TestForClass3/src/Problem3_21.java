import java.util.Scanner;

public class Problem3_21 {

	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		System.out.print("Enter Year:");
		int year=cin.nextInt();
		System.out.print("Enter month:");
		int month=cin.nextInt();
		System.out.print("Enter the day of the month:");
		int date=cin.nextInt();
		String[] week=new String[10];
		if(month==1||month==2)
		{
			month=12+month;
			year--;
		}
		week[2]="Monday";
		week[3]="Tuesday";
		week[4]="Wendsday";
		week[5]="Thursday";
		week[6]="Friday";
		week[0]="Saturday";
		week[1]="Sunday";
		
		int h=(date+26*(month+1)/10+(year%100)+(year%100)/4+(year/100/4)+5*(year/100))%7;
		System.out.println("Day of the week is "+week[h]);


	}

}
