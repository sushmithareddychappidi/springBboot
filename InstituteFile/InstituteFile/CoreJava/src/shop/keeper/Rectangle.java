package shop.keeper;

public class Rectangle 
{
	private int length;
	   private int width;
	   public Rectangle(String color,int borderSize,int length,int width)
		{
		   super(color,borderSize);
		   this.length=length;
		   this.width=width;
		}
		public void rectInfo()
		{
			System.out.println("Length: "+length);
			System.out.println("Width: "+width);
		}
}
