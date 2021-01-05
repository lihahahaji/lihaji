import java.util.Random;
public class Problem9_6 {

	public static void selectSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
	    {
	        int min=i;
	        for(int j=i;j<arr.length;j++)
	        {
	            if(arr[j]<arr[min])
	            {
	                min=j;
	            }
	        }
	        int t=arr[i];
	        arr[i]=arr[min];
	        arr[min]=t;
	    }
	}
	
	public static void main(String[] args)
	{
		Random r=new Random(1);
		int[] a=new int[100000];
		for(int i=0;i<100000;i++) a[i]=r.nextInt();
		
		StopWatch sw=new StopWatch();
		selectSort(a);
		sw.stop();
		
		System.out.println(sw.getElapsedTime());
	}
}

class StopWatch
{
	private long startTime;
	private long endTime;
	StopWatch()
	{
		this.startTime=System.currentTimeMillis();
	}
	
	public void start()
	{
		this.startTime=System.currentTimeMillis();
	}
	
	public void stop()
	{
		this.endTime=System.currentTimeMillis();
	}
	
	public long getElapsedTime()
	{
		return endTime-startTime;
	}
}
