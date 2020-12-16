import java.util.*;
public class MyStack
{
	private ArrayList<Object> list =new ArrayList<>();
	
	public boolean isEmpty()
	{
		return this.list.isEmpty();
	}
	
	public int getSize()
	{
		return this.list.size();
	}
	
	public Object peek()
	{
		return this.list.get(getSize()-1);
	}
	
	public Object pop()
	{
		Object o=list.get(this.getSize()-1);
		list.remove(getSize()-1);
		return o;
	}
	
	public void push(Object o)
	{
		list.add(o);
	}
	
	public String toString()
	{
		return "stack: "+list.toString();
	}
	
	
}
