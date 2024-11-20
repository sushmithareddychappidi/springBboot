package shop.keeper;

public class Circle 
{
	 private int radius;
	   public Circle(String color,int borderSize,int radius)
		{
		   super(color,borderSize);
		   this.radius=radius;
		}
		public void circleInfo()
		{
			System.out.println("Radius: "+radius);
		}
}
