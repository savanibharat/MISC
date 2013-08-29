
public class StringConversion {
	public static void main(String args[])
	{
		int num=16;
		System.out.println("Original integer is "+num);
		System.out.println("Binary is "+Integer.toBinaryString(num));
		System.out.println("Hex is "+Integer.toHexString(num));
		System.out.println("Octal is "+Integer.toOctalString(num));
	}
}
