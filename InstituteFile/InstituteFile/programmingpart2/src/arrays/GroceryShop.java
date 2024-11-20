package arrays;

public class GroceryShop 
{
	public static void main(String[] args) 
	{
		String pro[]= {"A","B","C","D","E","F","G"};
		int prices[]= {10,  20,30,  50, 60,70, 100};
		int money=200;
		int sum=0;
		for(int names=0;names<pro.length;names++)
		{
			for(int amount=0;amount<prices.length;amount++)
			{
				sum=sum+prices[amount];
	            if(sum<=money)
	            {
	               System.out.println("product :"+pro[names]+" prices : " +prices[amount]);
	            }
			}
			sum=0;
		}
	}

}
