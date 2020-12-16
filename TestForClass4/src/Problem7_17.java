import java.util.Scanner;

public class Problem7_17 {

	public static class student
	{
		private String name;
		private int score;
		
		
		public student(String s,int sc)
		{
			this.name=s;
			this.score=sc;
		}
	}
	
	static void selectSort(student[] stu,int maxn)
	{
		
	    for(int i=0;i<maxn;i++)
	    {
	        int min=i;
	        for(int j=i;j<maxn;j++)
	        {
	            if(stu[j].score<stu[min].score)
	            {
	                min=j;
	            }
	        }
	       
	        student temp=stu[i];
	        stu[i]=stu[min];
	        stu[min]=temp;
	    }
	}

	
	public static void main(String[] args)
	{
		
		System.out.print("Please enter the number of students: ");
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt();
		student[] stu=new student[n];
		for(int i=0;i<n;i++)
		{
			
			String ss=cin.next();
			int aa=cin.nextInt();
			

			
			stu[i]=new student(ss,aa);
			
		}
		
		selectSort(stu,n);
		
		for(int i=0;i<n;i++)
		{
			System.out.println(stu[i].name);
		}

	}

}


