package Collections;
import java.util.*;
public class ArrayDequeDemo {
	public static void main(String args[])
	{
		ArrayDeque<String> ad=new ArrayDeque<String>();
		ad.push("a");
		ad.push("b");
		ad.push("c");
		ad.push("d");
		
		ad.offerFirst("a1");
		System.out.println(ad);
		while(ad.peek()!=null)
			System.out.println(ad.pop());
		
	}
}
