package Collections;
import java.util.*;
public class ArrayListToArray {
	public static void main(String args[])
	{
		int sum=0;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		//Convert ArrayList to array
		Integer[] ai = new Integer[arr.size()];
		ai=arr.toArray(ai);
		//for(int i:ai)
		for(int i=1;i<=arr.size();i++)
			sum+=i;
		System.out.println(sum);
			
	}
}
