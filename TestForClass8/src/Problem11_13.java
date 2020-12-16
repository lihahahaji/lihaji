import java.util.*;
public class Problem11_13 {
    public static void removeDuplicate(ArrayList<Integer> list)
    {
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            if(!b.contains(list.get(i))) b.add(list.get(i));
        }

        System.out.print("The distinct integers are ");
        for(int i=0;i<b.size();i++)
        {
            System.out.print(b.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            int tmp=cin.nextInt();
            a.add(tmp);
        }
        removeDuplicate(a);
    }
}