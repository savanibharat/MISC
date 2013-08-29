
public class setCharAtDemo {
	public static void main(String args[])
	{
		/*StringBuffer sb=new StringBuffer("hell");
		System.out.println(sb.charAt(1));
		sb.setCharAt(1, 'b');
		System.out.println(sb);
		sb.setLength(2);
		System.out.println(sb);
		*/
		StringBuffer sb=new StringBuffer("hell0");
		char target[]=new char[3];
		sb.getChars(0, 2, target, 0);
		System.out.println(target);
	}
}
