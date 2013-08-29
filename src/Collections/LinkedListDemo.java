package Collections;
import java.util.*;
public class LinkedListDemo {
	public static void main(String args[])
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		System.out.println("Contents of linked list of string "+ll);
		
		ll.addFirst("!");
		System.out.println("After First element "+ll);
		ll.addLast(")");
		System.out.println("After last element "+ll);
		
		ll.remove(0);
		System.out.println("After first element deleted"+ll);
		ll.removeFirst();
		ll.removeLast();
		String val=ll.get(1);
		ll.set(1, val+" changed");
		System.out.println("Value changed "+ll);
		ll.clear();
		System.out.println(ll);
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		System.out.println(ll);
	}
}
