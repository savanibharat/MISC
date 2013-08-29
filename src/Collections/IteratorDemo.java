package Collections;
import java.util.*;

public class IteratorDemo {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		
		//use iterator for displaying contents
		
		System.out.println("Original contents of array list ");
		Iterator<String> i=al.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
		System.out.println();
		ListIterator <String> li=al.listIterator();
		while(li.hasNext())
		{
			String element=li.next();
			li.set(element+" + ");
		}
		System.out.println();
		System.out.println("Modified Contents");
		i=al.iterator();
		System.out.println();
		while(i.hasNext())
			System.out.print(i.next());
			
		}
	}