import java.util.Scanner;
public class Problem7_18 {

	static void selectsort(int[] arr,int maxn)
	{
	    for(int i=0;i<maxn;i++)
	    {
	        int min=i;
	        for(int j=i;j<maxn;j++)
	        {
	            if(arr[j]<arr[min])
	            {
	                min=j;
	            }
	        }
	        //swap(arr[i],arr[min]);
	        int tmp=arr[i];
	        arr[i]=arr[min];
	        arr[min]=tmp;
	    }
	}

	
	public static void main(String[] args)
	{
		Scanner cin=new Scanner(System.in);
		int[] a=new int[20];
		for(int i=0;i<10;i++) a[i]=cin.nextInt();
		selectsort(a,10);
		for(int i=0;i<10;i++) System.out.print(a[i]+" ");

	}

}
