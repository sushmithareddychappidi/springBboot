package arrays;

public class Worker 
{
	public static void main(String[] args) 
	{
		int hrs[]= {8,6,2,9,3,5};
		int firestWeek=0;
		int secondWeek=0;
		for(int i=0;i<hrs.length;i++)
		{
			if(i<hrs.length/2)
			{
				firestWeek=firestWeek+hrs[i];				
			}
			else
			{
				secondWeek=secondWeek+hrs[i];				
			}
		}
			firestWeek=firestWeek*100;
			secondWeek=secondWeek*100;
		if(firestWeek==secondWeek)
		{
			System.out.println("first week of the worker salary is equal to the second week of the worker salary");
		}
		else
		{
			System.out.println("first week of the worker salary is not equal to the second week of the worker salary");
		}
	}

}
