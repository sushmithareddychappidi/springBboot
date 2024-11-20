package shop.keeper;
import java.util.ArrayList;
import java.util.Scanner;
import user.ColorMissMatchException;
import user.InavalidHeightException;
import user.CompanyMissMatchException;

public class MarkerDriver 
{
	private Marker m;
	ArrayList<Marker> marker=new ArrayList<Marker>();
	public void addMarker(Marker m)
	{
		marker.add(m);
		System.out.println("Marker Added Successfully");
	}
	public void displayMarker()
	{
		if(marker.isEmpty())
		{
			System.out.println("There is No Markers");
		}
		else
		{
			for(Marker mar:marker)
			{
				mar.display();
			}
		}
	}
	public void searchMarkerBasedOnSerialNo(String serialNo)
	{
		boolean isFound=false;
		if(marker.isEmpty())
		{
			System.out.println("There is no Markers");
		}
		else
		{
			for(Marker mar:marker)
			{
				if(mar.getSerialNo().equalsIgnoreCase(serialNo))
				{
					System.out.println("Marker Found: "+mar.getCompany());
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			System.out.println("Marker Not Found");
		}
	}
	public void updateMarkerColorBasedOnSerialNo(String serialNo,String newColor)
	{
		boolean isUpdated=false;
		if(marker.isEmpty())
		{
			System.out.println("There is No Marker");
		}
		else
		{
			for(Marker mar:marker)
			{
				if(mar.getSerialNo().equalsIgnoreCase(serialNo))
				{
					mar.setColor(newColor);
					isUpdated=true;
				}
			}
		}
		if(isUpdated==false)
		{
			System.out.println("Marker Color is Not Updated");
		}
	}
	public static void main(String[] args)
	{
		MarkerDriver m=new MarkerDriver();
		Scanner sc=new Scanner(System.in);
		boolean start=true;
		while(start)
		{
			System.out.println("Enter The Choice : \n 1. AddMarker  \n 2. DisplayMarker \n 3.SearchMarkerBasedOnSerialNo \n 4. updateMarkerColorBasedOnSerialNo  \n 5. Exit ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter The Marker Color.....");
				String color=sc.next();
				System.out.println("Enter The Marker Height.....");
				int height=sc.nextInt();
				System.out.println("Enter The Marker Company.....");
				String company=sc.next();
				System.out.println("Enter The Marker SerialNo.....");
				String serialNo=sc.next();
				while(true)
				{
					try
					{
						m.addMarker(new Marker(color, height, company, serialNo));
						break;
					}
					catch(ColorMissMatchException e)
					{
						System.out.println("Re-enter The Marker Color");
						color=sc.next();
					}
					catch(InavalidHeightException e)
					{
						System.out.println("Re-enter The Marker Height");
						height=sc.nextInt();
					}
					catch(CompanyMissMatchException e)
					{
						System.out.println("Re-enter The Marker Company");
						company=sc.next();
					}
				}
			}
			break;
			case 2:
			{
				m.displayMarker();
			}
			break;
			case 3:
			{
				System.out.println("Enter The Marker SerialNo");
				String serialNo=sc.next();
				m.searchMarkerBasedOnSerialNo(serialNo);
			}
			break;
			case 4:
			{
				System.out.println("Enter The Marker SerialNo");
				String serialNo=sc.next();
				System.out.println("Enter The New Color");
				String color=sc.next();
				while(true)
				{
					try
					{
						m.updateMarkerColorBasedOnSerialNo(serialNo, color);
						break;
					}
					catch(ColorMissMatchException e)
					{
						System.out.println("Re-enter The Marker Color");
						color=sc.next();
					}
				}
			}
			break;
			case 5:
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
