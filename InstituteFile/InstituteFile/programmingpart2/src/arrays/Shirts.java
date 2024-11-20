package arrays;

public class Shirts 
{
	public static void main(String[] args)
	{
		String shop[]= {"M","L","XL","M","XL"};
		for(int i=0;i<shop.length;i++)
		{
			String size=shop[i];
			switch(size)
			{
			case "M":
			{
				System.out.println("5 buttons");
				break;
			}
			case "L":
			{
				System.out.println("6 buttons");
				break;
			}
			case "XL":
			{
				System.out.println("8 buttons");
				break;
			}
			}
		}
				
	}

}
