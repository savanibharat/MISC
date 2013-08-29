import java.io.*;

public class ParseDemoStringToInteger {
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		int i;
		int sum=0;
		
		System.out.println("Enter number, 0 to quit");
		do
		{
			str=br.readLine();
			try
			{
				i=Integer.parseInt(str);
			}
			catch(Exception e){i=0;}
			sum+=i;
			System.out.println(sum);
		}while(i!=0);
	}
}
