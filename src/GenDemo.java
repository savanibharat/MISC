class Gen<t>
{
	t ob;
	Gen(t o)
	{
		ob=o;
	}
	
	t getob()
	{
		return ob;
	}
	void showType()
	{
		System.out.println("Type of t::"+ob.getClass().getName());
	}
}
public class GenDemo {
	public static void main(String args[])
	{
		Gen<Integer> iob;
		iob=new Gen<Integer>(88);
		iob.showType();
		
		int v=iob.getob();
		System.out.println("Value::"+v);

		Gen<String>sob;
		sob=new Gen<String>("Generics test");
		sob.showType();
		
		String str=sob.getob();
		System.out.println("Value::"+str);
				
	}
}
