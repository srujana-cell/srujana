package srujana.logout;

import srujana.login.Test;

public class Sample extends Test 
{
	
	public void disp() 
	{
		System.out.println("in different package");
		System.out.println("------------------------------------------");
		
		System.out.println("protected --> z = "+z);
		System.out.println("public --> m = "+m);
	}
	

}
