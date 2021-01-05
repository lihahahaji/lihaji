import java.util.*;
public class Problem11_15 
{
    public static double getlen(Pointt a,Pointt b)
    {
        double res=Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
        return res;
    }

    public static double getArea(double l1,double l2,double l3)
    {
        double p=1/2.0*(l1+l2+l3);
        double res=Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
        return res;
    }
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        System.out.print("Enter the number of the points: ");
        int n=cin.nextInt();
        System.out.println("Enter the coordinates of the points: ");

        Pointt[] p=new Pointt[n+1]; //含义是创建多个空指针null 因此需要new 而不能用set访问
        for(int i=0;i<n;i++)
        {
            double x=cin.nextDouble();
            double y=cin.nextDouble();
            // p[i].set(x,y);
            p[i]=new Pointt(x,y);
        }
        cin.close();
        

        double res=0;
        for(int i=2;i<n;i++)
        {
            double l1=getlen(p[0],p[i-1]);
            double l2=getlen(p[0],p[i]);
            double l3=getlen(p[i],p[i-1]);
            
            res+=getArea(l1, l2, l3);
            
        }

        System.out.println(res);

        
    }

}

class Pointt
{
    public double x;
    public double y;

    public Pointt(double x,double y)
    {
        this.x=x;
        this.y=y;
    }

    public void set(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
}