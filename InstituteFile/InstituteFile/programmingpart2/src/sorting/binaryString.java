package sorting;

public class binaryString 
{
	public static int binarySearch(String a[],String element)
	{
		int start=0;
		int end=a.length-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(element==a[mid])
			{
				return mid;
			}
			else if(element>a[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		String a[]= {"apple","banana","grapes"};
	}
}
