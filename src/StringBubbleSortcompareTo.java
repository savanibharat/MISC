
public class StringBubbleSortcompareTo {
	
	public static void main(String args[])
	{String str[]={"this", "is","bharat","savani","friend","of","lucid","dreaming","and","manipulator"};
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[j].compareToIgnoreCase(str[i])<0)
				{
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;	
				}
				
			}
			System.out.println(str[i]);
		}
		
	}
}
