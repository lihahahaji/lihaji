import java.util.*;
public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>a=new ArrayList<Integer>();
		
		while(true)
		{
			try
			{
				a.add(1);
			}
			catch(OutOfMemoryError e)
			{
				System.out.println(e.getMessage());
				System.exit(0);
			}
		}

	}

}
