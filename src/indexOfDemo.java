
public class indexOfDemo{
	public static void main(String args[])
	{
		String s="Now is the time for all good men "+"to come to the aid of their country.";
		System.out.println(s);
		char ch='t';
		System.out.println("indexof(t)  "+s.indexOf(ch));
		System.out.println("lastIndexOf(t)"+s.lastIndexOf('t'));
		
		System.out.println("indexOf(the) "+s.indexOf("the"));
		
		System.out.println("lastIndexOf(the) "+s.lastIndexOf("the"));
		
		System.out.println("indexOf(t,10)"+s.indexOf('t',10));
		
		System.out.println("lastIndexOf(t,100)  "+s.lastIndexOf('t',100));//lastIndexOf searched backwards
	}

}