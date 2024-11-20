package com;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class BagDriverClass 
{
	private Bag b;
	ArrayList<Bag> bag=new ArrayList<Bag>();
	public void addBag(Bag b)
	{
		bag.add(b);
		System.out.println("Bag Added Successfully");
	}
	public void displayBag()
	{
		if(bag.isEmpty())
		{
			System.out.println("There is No Bags");
		}
		else
		{
			for(Bag b:bag)
			{
				b.display();
			}
		}
	}
	public void searchBagBasedOnCost(int cost)
	{
		boolean isFound=false;
		if(bag.isEmpty())
		{
			System.out.println("There is No Bag");
		}
		else
		{
			for(Bag b:bag)
			{
				if(b.getCost()==cost)
				{
					System.out.println("Brand : "+b.getBrand()+" ");
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			throw new InvalidCostException();
		}		
	}
	public void searchBagBasedOnBrand(String brand)
	{
		boolean isFound=false;
		if(bag.isEmpty())
		{
			System.out.println("There is No Bag");
		}
		else
		{
			for(Bag b:bag)
			{
				if(b.getBrand().equalsIgnoreCase(brand))
				{
					System.out.println("Bag  Found : "+b.getBrand());
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			throw new brandMissMatchException();
		}
	}
	
	public void updateBagCostBasedOnCompartments(int newCost,int noOfCompartments)
	{
		boolean isUpdate=false;
		boolean cost=false;
		if(bag.isEmpty())
		{
			System.out.println("There is No Bag");
		}
		else
		{
			for(Bag b:bag)
			{
				if(b.getNoOfCompartments()==noOfCompartments)
				{
					b.setCost(newCost);
					cost=true;
					isUpdate=true;
					System.out.println("Bag Cost Updated To :"+newCost);
				}
			}
		}
		if(isUpdate==false)
		{
			System.out.println("Compartments R not Matched");
			throw new InvalidNoOfCompartments();
		}
		if(cost==false)
		{
			System.out.println("Bag Cost Not Updated");
			throw new InvalidCostException();
		}
		
	}
	public void removeBagBasedOnCost(int cost)
	{
		boolean isRemove=false;
		ListIterator<Bag> li=bag.listIterator();
		if(bag.isEmpty())
		{
			System.out.println("There is No Bag");
		}
		else
		{
			while(li.hasNext())
			{
				Bag b=li.next();
				if(b.getCost()==cost)
				{
					li.remove();
					isRemove=true;
					System.out.println("Bag Removed");
					//b.display();
				}
			}
		}
		if(isRemove==false)
		{
			System.out.println("Bag is not removed");
		}
	}
	
	public static void main(String[] args)
	{
		BagDriverClass m=new BagDriverClass();
		Scanner sc=new Scanner(System.in);
		boolean start=true;
		while(start)
		{
			System.out.println("Enter The Choice : \n 1. AddBag  \n 2. DisplayBag \n 3.searchBagBasedOnCost \n 4. searchBagBasedOnBrand \n 5. updateBagCostBasedOnCompartments \n 6. removeBagBasedOnCost   \n 7. Exit ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter The Bag Brand.....");
				String brand=sc.next();
				System.out.println("Enter The Bag Cost.....");
				int cost=sc.nextInt();
				System.out.println("Enter The Bag Color.....");
				String color=sc.next();
				System.out.println("Enter The Bag no.Of.Compartments.....");
				int noOfCompartments=sc.nextInt();
				while(true)
				{
					try
					{
						m.addBag(new Bag(brand, cost, color, noOfCompartments));
						break;
					}
					catch(brandMissMatchException e)
					{
						System.out.println("Re-enter The Bag Brand");
						brand=sc.next();
					}
					catch(InvalidCostException e)
					{
						System.out.println("Re-enter The Bag Cost");
						cost=sc.nextInt();
					}
					catch(colorMissMatchException e)
					{
						System.out.println("Re-enter The Bag Color");
						color=sc.next();
					}
					catch(InvalidNoOfCompartments e)
					{
						System.out.println("Re-enter The Bag Compartments");
						noOfCompartments=sc.nextInt();
					}
				}
			}
			break;
			case 2:
			{
				m.displayBag();
			}
			break;
			case 3:
			{
				System.out.println("Enter The Cost to Search Bag Based On Cost");
				int cost=sc.nextInt();
				while(true)
				{
					try
					{
						m.searchBagBasedOnCost(cost);
						break;
					}
					catch(InvalidCostException e)
					{
						System.out.println("Re-enter The Cost....");
						cost=sc.nextInt();
					}
				}
			}
			break;
			case 4:
			{
				System.out.println("Enter The Brand to Search Bag");
				String brand=sc.next();
				while(true)
				{
					try
					{
						m.searchBagBasedOnBrand(brand);
						break;
					}
					catch(brandMissMatchException e)
					{
						System.out.println("Re-enter The Brand....");
						brand=sc.next();
					}
				}
			}
			break;
			case 5:
			{
				System.out.println("Enter The Cost");
				int cost=sc.nextInt();
				System.out.println("Enter The noOfCompartments");
				int noOfCompartments=sc.nextInt();
				try
				{
					m.updateBagCostBasedOnCompartments(cost, noOfCompartments);
					break;
				}
				
				catch(InvalidNoOfCompartments e)
				{
					System.out.println("Re-enter The Bag Compartments");
					noOfCompartments=sc.nextInt();
				}
				catch(InvalidCostException e)
				{
					System.out.println("Re-enter The Cost....");
					cost=sc.nextInt();
				}
			}
			break;
			case 6:
			{
				System.out.println("Enter The Cost to Remove Bag Based On Cost");
				int cost=sc.nextInt();
				while(true)
				{
					try
					{
						m.removeBagBasedOnCost(cost);
						break;
					}
					catch(InvalidCostException e)
					{
						System.out.println("Re-enter The Cost....");
						cost=sc.nextInt();
					}
				}
			}
			break;
			case 7:
			{
				start=false;
				System.out.println("Thank You ......:)");
			}
			break;
			default:
			{
				System.out.println("Enter Valid Choice ....:(");
			}
			}
		}
	}
	
}
