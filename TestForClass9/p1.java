import java.util.*;



public class p1
{
    public static void main(String[] args)
    {
        Map<String,book> mp=new HashMap<String,book>();
        
        mp.put("#0001",new book("#0001","book1",12.56,"HZNU"));
        mp.put("#0002",new book("#0002","book2",45.54,"HZNU"));
        mp.put("#0003",new book("#0003","book3",212.76,"HZNU"));
        mp.put("#0004",new book("#0004","book4",112.89,"HZNU"));
        mp.put("#0005",new book("#0005","book5",123.94,"HZNU"));
        
        Iterator iter =mp.entrySet().iterator();

        while(iter.hasNext())
        {
            Map.Entry entry=(Map.Entry)iter.next();
            System.out.println(entry.getKey()+" "+((book)entry.getValue()).name+" "+((book)entry.getValue()).price+" "+((book)entry.getValue()).publisher);
        }

    }
}

class book
{
    String num;
    String name;
    double price;
    String publisher;
    public book(String num,String name,double price,String publisher)
    {
        this.num=num;
        this.name=name;
        this.price=price;
        this.publisher=publisher;
    }

}