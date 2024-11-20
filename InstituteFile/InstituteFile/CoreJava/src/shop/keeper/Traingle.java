package shop.keeper;

public class Traingle 
{
	 private int base;
	   private int height;
	   public Traingle(String color,int borderSize,int base,int height)
		{
		   super(color,borderSize);
		   this.base=base;
		   this.height=height;
		}
		public void tranInfo()
		{
			System.out.println("Base: "+base);
			System.out.println("Height: "+height);
		}
}
