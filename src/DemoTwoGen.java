class TwoGen<T,V>
{
	T ob1;
	V ob2;
	
	TwoGen(T o1, V o2)
	{
		ob1=o1;
		ob2=o2;
	}
	
	void showtype()
	{
		System.out.println("TYPE:: "+ob1.getClass().getName());
		System.out.println("TYPE:: "+ob2.getClass().getName());
	}
	
	T getob1()
	{
		return ob1; 
	}
	V getob2()
	{
		return ob2;
	}
}
public class DemoTwoGen {

	public static void main(String args[])
	{
		TwoGen<Integer, String> isob=new TwoGen<Integer, String>(12,"ab");
		isob.showtype();
		
		int v=isob.getob1();
		System.out.println(v);
		
		String s=isob.getob2();
		System.out.println(s);
	}
}
