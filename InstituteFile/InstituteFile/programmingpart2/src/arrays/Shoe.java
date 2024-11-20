package arrays;

public class Shoe 
{
	public static void main(String[] args) 
	{
		int rack[]= {6,7,8,9,10,7,8,6};
		System.out.println("Before Re-arrangement");
		for(int shoe=0;shoe<rack.length;shoe++)System.out.println(rack[shoe]+" ");
		System.out.println();
		for(int shoe=0;shoe<rack.length-1;shoe++)
		{
			if(rack[shoe]>rack[shoe+1])
			{
				int temp=rack[shoe];
				rack[shoe]=rack[shoe+1];
				rack[shoe+1]=temp;				
			}
			shoe++; 
		}
		System.out.println("After Re-arrangement");
		for(int shoe=0;shoe<rack.length;shoe++)System.out.println(rack[shoe]+" ");
		System.out.println();
		
	}

}
