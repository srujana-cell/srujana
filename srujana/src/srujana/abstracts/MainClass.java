package srujana.abstracts;

public class MainClass 
{
	public static void main(String[] args)
	{
		System.out.println("main method started");
		C c = new C();
		c.m1();
		c.m2();
		
		System.out.println("x = "+c.x);
		System.out.println("y = "+c.y);
		System.out.println("z = "+c.z);
	}
}
