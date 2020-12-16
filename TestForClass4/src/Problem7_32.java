import java.util.Scanner;
public class Problem7_32 {

	public static int[] partition(int[] list)
	{
		int tmp=list[0];
		int[] l=new int[list.length];
		int k=0;
		for(int i=1;i<list.length;i++)
		{
			if(list[i]<=tmp) l[k++]=list[i];
		}
		
		l[k++]=tmp;
		
		for(int i=1;i<list.length;i++)
		{
			if(list[i]>tmp) l[k++]=list[i];
		}
		return l;
	}
	
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		System.out.print("Enter list:");
		int n=cin.nextInt();
		int[] list=new int[n];
		for(int i=0;i<n;i++) list[i]=cin.nextInt();
		
		int[] list1=partition(list);
		for(int i=0;i<list1.length;i++)
		{
			System.out.print(list1[i]+" ");
		}
	}

}
