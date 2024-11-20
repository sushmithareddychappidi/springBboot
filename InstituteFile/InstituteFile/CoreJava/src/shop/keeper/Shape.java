package shop.keeper;

public class Shape 
{
	public String color;
	   public int borderSize;
	   public Shape(String color,int borderSize)
		{
		   this.color=color;
		   this.borderSize=borderSize;
		}
		public void shapeInfo()
		{
			System.out.println("****************************");
			System.out.println("Color: "+color);
			System.out.println("Border Size: "+borderSize);
		}
}
