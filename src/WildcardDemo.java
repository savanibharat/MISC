class States<T extends Number>
{
	T[] nums;
	States(T[] o)
	{
		nums=o;
	}
	double average()
	{
		double sum=0;
		for(int i=0;i<nums.length;i++)
			sum+=nums[i].doubleValue();
		return sum/nums.length;
	}
	
	boolean sameAvg(States<?> ob)
	{
		if(average()==ob.average())
			return true;
		return false;
	}
}
public class WildcardDemo {
	public static void main(String args[])
	{
		Integer inums[]={1,2,3,4,5};
		States <Integer> iob = new States<Integer>(inums);
		double v=iob.average();
		System.out.println(v);
				
		
		Double dnums[]={1.0,2.0,3.0,4.0,5.0};
		States <Double> dob=new States<Double>(dnums);
		Double d=dob.average();
		System.out.println(d);
		
		if(iob.sameAvg(dob))
			System.out.println("Same average");
		else
			System.out.println("Different Average");
	}
}
