class TwoD
{
		int x,y;
		TwoD(int a,int b)
		{
			x=a;y=b;
		}
}

class ThreeD extends TwoD
{
		int z;
		ThreeD(int a,int b,int c)
		{
			super(a,b);
			z=c;
		}
}

class FourD extends ThreeD
{
		int t;
		FourD(int a,int b,int c,int d)
		{
			super(a,b,c);
			t=d;
		}
}

class Coords<T extends TwoD>
{
	T[] coords;
	Coords(T[] o)
	{
		coords=o;
	}
}


public class BoundedWildcard {
	
	static void showXY(Coords<?>c)
	{
		System.out.println("X Y coords");
		for(int i=0;i<c.coords.length;i++)
			System.out.println(c.coords[i].x+" "+c.coords[i].y);
		System.out.println();
	}
	
	static void showXYZ(Coords<? extends ThreeD>c)
	{
		System.out.println("X Y Z coords");
		for(int i=0;i<c.coords.length;i++)
			System.out.println(c.coords[i].x+" "+c.coords[i].y+" "+c.coords[i].z);
		System.out.println();
	}
	
	static void showAll(Coords<? extends FourD>c)
	{
		System.out.println("x y z t coords");
		for(int i=0;i<c.coords.length;i++)
			System.out.println(c.coords[i].x+" "+c.coords[i].y+" "+c.coords[i].z+" "+c.coords[i].t);
		System.out.println();
	}
	public static void main(String args[])
	{
		TwoD td[]={new TwoD(-0,-0),
					new TwoD(-1,-1),
					new TwoD(-2,-2)
		};
		Coords<TwoD> tdlocs=new Coords<TwoD>(td);
		System.out.println("Contents of TwoD");
		showXY(tdlocs);
		
		FourD fd[]={new FourD(0,0,0,0),
					new FourD(1,1,1,1),
					new FourD(2,2,2,2)};
					
		Coords<FourD> fdlocs=new Coords<FourD>(fd);
		showXY(fdlocs);
		showXYZ(fdlocs);
		showAll(fdlocs);
		}
		
	}

