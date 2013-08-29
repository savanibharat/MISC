package Collections;
import java.util.*;
public class ArrayListDemo {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Initial size of array list is "+al.size());
		
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		//al.add(1,"f");
		
		System.out.println("Current size of array list is "+al.size());
		
		al.remove(2);
		System.out.println(al);
		
		
	}
}
