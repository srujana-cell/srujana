package srujana.login;

public class Demo 
{
	public void print() 
	{
		System.out.println("within the package");
		System.out.println("------------------------------------------");
		
		Test t= new Test();
		
		System.out.println("default -->  y = "+t.y);
		System.out.println("protected -->  z = "+t.z);
		System.out.println("public -->  m = "+t.m);
	}

}
