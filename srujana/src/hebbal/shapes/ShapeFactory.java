package hebbal.shapes;

public class ShapeFactory
{
	public  Shape getShape(String type)
	{
		Shape s; //interface type ref var
		
		if(type == null)
		{
			s = null;
		}
		else if(type.equalsIgnoreCase("circle"))
		{
			s = new Circle();
		}
		else if(type.equalsIgnoreCase("square"))
		{
			s = new Square();
		}
		else
		{
			s = new Rectangle();
		}
		
		return s;//interface type
	}


}
