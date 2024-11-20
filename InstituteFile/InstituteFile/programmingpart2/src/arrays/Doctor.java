package arrays;

public class Doctor 
{
public static void main(String[] args) 
{
	int ages[]= {60,63,56,70,54,50,50,72,61,65,53,30};
	System.out.println("Before Re-arranging");
	for(int patient=0;patient<ages.length;patient++) System.out.println(ages[patient]+" "); System.out.println();

	for(int patient=0;patient<ages.length-1;patient++)
	{
		if(ages[patient]>60)
		{
			int temp=ages[patient];
			ages[patient]=ages[patient+1];
			ages[patient+1]=temp;
			patient++;
		}
		else if(ages[patient]<60)
		{
			int temp=ages[patient];
			ages[patient]=ages[patient-1];
			ages[patient-1]=temp;
			patient++;
		}
	}
	int totalHrs=ages.length/2;
	System.out.println("After Re-arranging");
	for(int patient=0;patient<ages.length;patient++) System.out.println(ages[patient]+" "); System.out.println();
	System.out.println(totalHrs);
	
}

}
