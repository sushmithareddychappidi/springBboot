package standard;

import java.util.Scanner;

public class SubArrayWith01 
{
	static Scanner sc=new Scanner(System.in);
	public static int[] initialize(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
    public static void printArray(int a[],int start,int end)
    {
    	for(int i=start;i<=end;i++)
    	{
    		System.out.println(a[i]+",");
    	}
    	System.out.println();
    }
    public static void subArray(int a[])
    {
        boolean status=false;
    	for(int i=0;i<a.length;i++)
    	{
    		int count0=0;
    		int count1=0;
    		for(int j=i;j<a.length;j++)
    		{
       			if(a[j]==0)
       			{
       				count0++;
       			}
       			else if(a[j]==1)
       			{
       				count1++;
       			}
    		}
    		if(count0==count1)
    		{
    			System.out.println(a[i]);
    			status=true;
    		}
    	}
    	if(!status)
    	{
    		System.out.println("not found");
    	}
    }

}
