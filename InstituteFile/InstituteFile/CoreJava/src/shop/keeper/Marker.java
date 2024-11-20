package shop.keeper;
import user.InavalidHeightException;
import user.ColorMissMatchException;
import user.CompanyMissMatchException;
public class Marker 
{
	private String color;
	private int height;
	private String company;
	private String serialNo;
	public Marker()
	{
		
	}
	public Marker(String color,int height,String company,String serialNo)
	{
		if(color.equalsIgnoreCase("black") || color.equalsIgnoreCase("white") ||color.equalsIgnoreCase("blue") )
		{
			this.color=color;
		}
		else
		{
			ColorMissMatchException c=new ColorMissMatchException();
			throw c;
		}
		if(height>=7 && height<=10)
		{
			this.height=height;
		}
		else
		{
			InavalidHeightException h=new InavalidHeightException();
			throw h;
		}
		if(company.equalsIgnoreCase("reynolds") || company.equalsIgnoreCase("parker") ||company.equalsIgnoreCase("cello"))
		{
			this.company=company;
		}
		else
		{
			throw new CompanyMissMatchException();			
		}
		if(serialNo.equalsIgnoreCase("rey123") || serialNo.equalsIgnoreCase("par123") || serialNo.equalsIgnoreCase("cel123"))
		{
			this.serialNo=serialNo;
		}
		else
		{
		    System.out.println("Invalid Serial No");
		}
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		if(getColor().equalsIgnoreCase("red")|| getColor().equalsIgnoreCase("green"))
		{
			this.color=color;
		}
		else
		{
			try
			{
				throw new ColorMissMatchException();
			}
			catch( ColorMissMatchException e)
			{
				System.out.println("Invalid color");
			}
		}
	}
	public int getHeight()
	{
		return height;
	}
	public void setHeight(int height)
	{
		if(getHeight()>=11 && getHeight()<=15)
		{
			this.height=height;
		}
		else
		{
			try
			{
				throw new InavalidHeightException();
			}
			catch(InavalidHeightException e)
			{
				System.out.println("Invalid height");				
			}
		}
	}
	public String getCompany()
	{
		return company;
	}
	public void setCompany(String company)
	{
		if(getCompany().equalsIgnoreCase("refilo")|| getCompany().equalsIgnoreCase("natraj")||getCompany().equalsIgnoreCase("classic"))
		{
			this.company=company;
		}
		else
		{
			try
			{
				throw new CompanyMissMatchException();
			}
			catch(CompanyMissMatchException e)
			{
				System.out.println("Invalid company");
			}
		}
	}
	public String getSerialNo()
	{
		return serialNo;
	}
	public void convert()
	{
		double heightInMeters=height/100.0;
		System.out.println("height in meters:"+heightInMeters+"M");
	}
	public void display()
	{
		System.out.println("Marker details --------------");
		System.out.println("company name : "+company);
		System.out.println("color of the marker : "+color);
		System.out.println("Height in cm : "+height+"CM");
		System.out.println("Serial No  : "+serialNo);
	}
	@Override
	public String toString()
	{
		return "\n Marker color: "+getColor()+
				"\n Marker height: "+getHeight()+
				"\n Marker company: "+getCompany()+
				"\n Marker Serial No: "+getSerialNo()+
				"\n-------------------------";
	}

}
