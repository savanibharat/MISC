
public class append {
	public static void main(String args[])
	{
		String s;
		int a = 11;
		
		StringBuffer sb=new StringBuffer(40);
		s=sb.append("a = ").append(a).toString();
		System.out.println(s);
		StringBuffer s1=new StringBuffer("This is a test");
		System.out.println(s1);
		s1.insert(2,"bharat");
		System.out.println(s1);
		System.out.println(s1.reverse());
		s1.delete(3, 9);
		System.out.println(s1);
		
	}
}
