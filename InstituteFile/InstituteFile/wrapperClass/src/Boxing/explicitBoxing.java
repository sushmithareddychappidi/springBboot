package Boxing;

public class explicitBoxing 
{
	public static void main(String[] args)
	{
		int a=10;
		Integer i=new Integer(a);
		System.out.println(i);
		
		
		
		long l=5678567;
		Long l1=new Long(l);
		System.out.println(l1);
		
		
		short s=123;
		Short s1=new Short(s);
		System.out.println(s1);
		
		double d=6.5;
		Double d1=new Double(d);
		System.out.println(d1);
	}
}
