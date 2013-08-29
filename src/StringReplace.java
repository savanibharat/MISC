
public class StringReplace {
	public static void main(String args[])
	{
		String org="This is a test.";
		String search="is";
		String sub="was";
		String result= "";
		int i;
		
		do{
			i=org.indexOf(search);
			System.out.println("i = "+i);
			if(i!=-1)
			{System.out.println(org);
				result=org.substring(0,i);
				System.out.println("result is "+result);
				System.out.println();
				result=result+sub;
				System.out.println("result=result+sub "+result);
				System.out.println();
				result=result+org.substring(i+search.length());
				System.out.println("result+org.substring(i+search.length()) "+result);
				System.out.println();
				org=result;
			}
		}while(i!=-1);
		
	}
}
