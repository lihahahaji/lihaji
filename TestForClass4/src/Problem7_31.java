import java.util.Scanner;
public class Problem7_31 {

	public static int[] merge(int[] list1,int[] list2)
	{
		int[] list=new int[list1.length+list2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i!=list1.length||j!=list2.length)
		{
			if(i==list1.length) list[k++]=list2[j++];
			else if(j==list2.length) list[k++]=list1[i++];
			else if(list1[i]>list2[j])
			{
				list[k++]=list2[j++];
			}
			else list[k++]=list1[i++];
		}
		return list;
	}
	
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		
		System.out.print("Enter list1:");
		int n=cin.nextInt();
		int[] l1=new int[n];
		for(int i=0;i<n;i++) l1[i]=cin.nextInt();
		
		System.out.print("Enter list2:");
		int m=cin.nextInt();
		int[] l2=new int[m];
		for(int i=0;i<m;i++) l2[i]=cin.nextInt();
		
		
		int[] l3=merge(l1,l2);
		System.out.print("The merged list is ");
		for(int i=0;i<l3.length;i++) System.out.print(l3[i]+" ");
		System.out.println("");

	}

}
