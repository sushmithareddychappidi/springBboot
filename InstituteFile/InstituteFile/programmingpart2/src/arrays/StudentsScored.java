package arrays;

public class StudentsScored 
{
	public static void main(String[] args) 
	{
		double marks[]= {79.5,83.5,95.5,96.5,65.5,82.6,75.7,85.6,61.4,95.4,72.9,79.5,89.7,76.8,93.6};
		int count=0;
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]>70.00 && marks[i]<92.5)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
