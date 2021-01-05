import java.util.Scanner;
public class Problem7_19 {

	public static boolean isSorted(int[] a,int n)
	{
		for(int i=0;i<n-1;i++)
		{
			if(a[i]>a[i+1]) return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		System.out.print("Enter the list:");
		int n=cin.nextInt();
		int[] a=new int[200];
		//System.out.println(a.length);
		for(int i=0;i<n;i++) a[i]=cin.nextInt();
		if(isSorted(a,n)) System.out.println("The list is aleady sorted.");
		else System.out.println("The list is not sorted.");

	}

}
