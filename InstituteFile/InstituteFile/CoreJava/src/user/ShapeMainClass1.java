package user;
//import shop.keeper.Circle;
//import shop.keeper.Rectangle;
import shop.keeper.Traingle;
import shop.keeper.Shape;

public class ShapeMainClass1 
{
	public static void draw(Shape shape)
	{
		//shape.shapeInfo();
		if(shape instanceof Circle)
		{
			Circle c=(Circle)shape;
			c.circleInfo();
		}
		else if(shape instanceof Rectangle)
		{
			Rectangle r=(Rectangle)shape;
			r.rectInfo();
		}
		else
		{
			Traingle t=(Traingle)shape;
			t.tranInfo();
		}
	}
	public static void main(String[] args) 
	{
		draw(new Circle("red",2,2));	
		draw(new Rectangle("yellow",2,1,4));
		draw(new Traingle("green",2,1,3));
	}
}
