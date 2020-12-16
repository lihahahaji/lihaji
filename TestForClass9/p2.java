import java.util.*;
public class p2 {
    public static void main(String[] args)
    {
        Scanner cin=new Scanner(System.in);
        Set<Student> st=new TreeSet<Student>();


        System.out.println("Enter the student:");
        while(cin.hasNext())
        {
            String num1=cin.next();
//            System.out.println(num1);
            if(num1.equals("exit"))
            {
                break;
            }
            
            String name1=cin.next();
            int age1=cin.nextInt();
            st.add(new Student(num1,name1,age1));
            System.out.println("Enter the student:");
        }
        
        Iterator<Student> it=st.iterator();
        while(it.hasNext())
        {
            Student s=(Student)it.next();
            System.out.println(s.num+" "+s.name+" "+s.age);
        }
    }
}

class Student implements Comparable
{
    String num;
    String name;
    int age;
    public Student(String num,String name,int age)
    {
        this.num=num;
        this.name=name;
        this.age=age;
    }

    public int compareTo(Object o)
    {
        if(!(o instanceof Student))
        {
            throw new RuntimeException("debug");
        }

        Student p=(Student) o;
        if(this.age>p.age) return 1;
        else return -1;
    }
}