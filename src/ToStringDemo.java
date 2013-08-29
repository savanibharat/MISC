class box
{
	int height;
	box(int h)
	{
		height=h;
	}
	public String toString()
	{
		return "Dimension is "+height+".";
	}
}
public class ToStringDemo {
public static void main(String args[])
{
	box b=new box(9);
	String s="Box b is::"+b;
	System.out.println(b);
	System.out.println(s);
}
}
