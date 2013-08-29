
public class StrinBufferDemo {
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("Hello");
		StringBuffer sb1=new StringBuffer("");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb1.capacity());
	}
}
