import java.util.*;
class Problem11_9
{
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        Random r=new Random(4);
        System.out.println("Enter the array size:");
        int n=cin.nextInt();
        cin.close();
        System.out.println("The radom array is:");


        int[][] a=new int[n+1][n+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=r.nextInt(2);
            }
        }


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int maxi=0;
        int maxj=0;
        int maxx=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==1) count++;
            }
            if(count>maxx)
            {
                maxx=count;
                maxi=i;
            }
        }
        maxx=0;
        for(int j=0;j<n;j++)
        {
            int count=0;
            for(int i=0;i<n;i++)
            {
                if(a[i][j]==1) count++;
            }
            if(count>maxx)
            {
                maxx=count;
                maxj=j;
            }
        }

        System.out.println("The largest row index: "+(maxi+1));
        System.out.println("The largest column index: "+(maxj+1));

    }
}