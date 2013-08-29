
public class StringExamples {
	public static void main(String args[])
	{
		//char ch[]=new char[10];
		//String s=new String(ch,2,3);
		//System.out.println(s);
		/*String str="home"+(2+2);
		System.out.println(str);
		System.out.println();
		System.out.println();
		System.out.println();
		String str1="javademo";
		str1.getChars(0, 5, ch, 0);
		System.out.println(ch);
		char ch1[]=str1.toCharArray();
		System.out.println(ch1);
		String s1,s2;
		s1="hell";
		s2="hello";
		if(s1.regionMatches(0, s2, 0, 3))
		System.out.println(true);
		else
			System.out.println(false);
		
		System.out.println("footbar".endsWith("bar"));
		System.out.println("footbar".startsWith("fo"));
		System.out.println("footbar".startsWith("ot",2));*/
		String s1="abc";
		String s2=new String(s1);
		String s3="abc";
		//if(s1==s2)
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}
}
