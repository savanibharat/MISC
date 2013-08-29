class Stats<T extends Number>
{
	T[] nums;
	Stats(T[] o)
	{
		nums=o;
	}
	
	double average()
	{
		double sum=0.0;
		for(int i=0;i<nums.length;i++)
			sum+=nums[i].doubleValue();
			
		return sum/nums.length;
	}
}
public class ArrayBoundDemo {
	public static void main(String args[])
	{
		Integer inums[]={1,3,5,7,9};
		Stats <Integer> iob=new Stats<Integer>(inums);
		
		double v=iob.average();
		System.out.println("iob average is "+v);
		
		Double dnums[]={1.1,3.3,5.5,7.7,9.9};
		Stats <Double> dob=new Stats<Double>(dnums);
		
		double d=dob.average();
		System.out.println("dob average is "+d);
		
	}
}
