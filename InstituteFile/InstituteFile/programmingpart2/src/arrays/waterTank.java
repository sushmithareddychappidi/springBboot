package arrays;

public class waterTank 
{
	public static void main(String[] args) 
	{
		int n=5;
		int tankCapacity[]= {1000,800,1200,1500,900};
		int totalWaterRequired=0;
		for(int i=0;i<n;i++)
		{
			int requiredWater=2000-tankCapacity[i];
			requiredWater=requiredWater<0?0:requiredWater;
			totalWaterRequired+=requiredWater;
			
			System.out.println("House"+(i+1)+": "+requiredWater+" litres");
		}
		System.out.println("Total Water Required for all houses: "+totalWaterRequired+" litres");
	}

}
