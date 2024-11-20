package COM;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;
public class ProductDriverClass 
{
	private Product p;
	Vector<Product> v=new Vector<Product>();
	public void add(Product p)
	{
		v.add(p);
		System.out.println("Added Successfully");
	}
	public void displayProduct()
	{
		if(v.isEmpty())
		{
			System.out.println("There is No Products");
		}
		else
		{
			for(Product b:v)
			{
				b.display();
			}
		}
	}
	public void displayPIdPNamebasedOnCost(int cost)
	{
		boolean isFound=false;
		if(v.isEmpty())
		{
			System.out.println("There is no product");
		}
		else
		{
			for(Product b:v)
			{
				if(b.getCost()==cost)
				{
					System.out.println("Product Id: "+b.getpId());
					System.out.println("Product Name: "+b.getpName());
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			System.out.println("Product not found enter valid cost");
		}
	}
	public void updateProductCostBasedOnProductId(int Pid,int newCost)
	{
		boolean isUpdate=false;
		boolean cost=false;
		if(v.isEmpty())
		{
			System.out.println("There is No Product");
		}
		else
		{
			for(Product b:v)
			{
				if(b.getpId()==Pid)
				{
					b.setCost(newCost);
					cost=true;
					isUpdate=true;
					System.out.println("Product Cost Updated To :"+newCost);
				}
			}
		}
		if(isUpdate==false)
		{
			System.out.println("Product Id not Matched");
			throw new IdInvalidException();
		}
		if(cost==false)
		{
			System.out.println("Product Cost Not Updated");
			throw new CostInvalidException();
		}		
	}
	public void removeProductBasedOnExpireDate(String edate)
	{
		boolean isRemove=false;
		ListIterator<Product> li=v.listIterator();
		if(v.isEmpty())
		{
			System.out.println("There is No Product");
		}
		else
		{
			while(li.hasNext())
			{
				Product b=li.next();
				if(b.getEdate().equalsIgnoreCase(edate))
				{
					li.remove();
					isRemove=true;
					System.out.println("Product Removed");
				}
			}
		}
		if(isRemove==false)
		{
			System.out.println("Product is not removed");
		}
	}
	public static void main(String[] args) 
	{
		ProductDriverClass p=new ProductDriverClass();
		Scanner sc=new Scanner(System.in);
		boolean start=true;
		while(start)
		{
			System.out.println("Enter The Choice: 1)add 2)displayProduct 3)displayPIdPNamebasedOnCost 4)updateProductCostBasedOnProductId 5)removeProductBasedOnExpireDate 6)exit");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter The Product Id.....");
				int pId=sc.nextInt();
				System.out.println("Enter The Product Name.....");
				String name=sc.next();
				System.out.println("Enter The Product Cost.....");
				int cost=sc.nextInt();
				System.out.println("Enter The Product manufactureDate.....");
				String mDate=sc.next();
				System.out.println("Enter The Product expireDate.....");
				String edate=sc.next();
				System.out.println("Enter The Product Category.....");
				String category=sc.next();
				while(true)
				{
					try
					{
						p.add(new Product(pId, name, cost, mDate,edate,category));
						break;
					}
					catch(IdInvalidException e)
					{
						System.out.println("Re-enter The Product Id");
						pId=sc.nextInt();
					}
					catch(nameMissMatchException e)
					{
						System.out.println("Re-enter The Product Name");
						name=sc.next();
					}					
					catch(CostInvalidException e)
					{
						System.out.println("Re-enter The Product Cost");
						cost=sc.nextInt();
					}
					catch(mdateMissMatchException e)
					{
						System.out.println("Re-enter The Product manufacture Date");
						mDate=sc.next();
					}
					catch(edateMissMatchEXception e)
					{
						System.out.println("Re-enter The Product expire Date");
					    edate=sc.next();
					}
					catch(categoryMissMAtchException e)
					{
						System.out.println("Re-enter The Product Category");
						category=sc.next();
					}
				}
			}
			break;
			case 2:
			{
				p.displayProduct();
			}
			break;
			case 3:
			{
				System.out.println("Enter the Cost");
				int cost=sc.nextInt();
				try
				{
					p.displayPIdPNamebasedOnCost(cost);
					break;
				}
				catch(CostInvalidException e)
				{
					System.out.println("Re-Enter The Cost");
					cost=sc.nextInt();
				}
				
			}
			break;
			case 4:
			{
				System.out.println("Enter The Product Id");
				int pid=sc.nextInt();
				System.out.println("Enter The Cost");
				int cost=sc.nextInt();
				try
				{
					p.updateProductCostBasedOnProductId(pid,cost);
					break;
				}
				catch(IdInvalidException e)
				{
					System.out.println("Re-enter The Id....");
					pid=sc.nextInt();
				}
				catch(CostInvalidException e)
				{
					System.out.println("Re-enter The Cost");
					cost=sc.nextInt();
				}
			}
			break;
			case 5:
			{
				System.out.println("Enter The Cost to Remove Product Based On expire Date");
				String edate=sc.next();
				while(true)
				{
					try
					{
						p.removeProductBasedOnExpireDate(edate);
						break;
					}
					catch(edateMissMatchEXception e)
					{
						System.out.println("Re-enter The Expire Date....");
						edate=sc.next();
					}
				}
			}
			break;
			case 6:
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

