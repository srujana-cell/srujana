package hebbal.stringclass;

public class StringDemo 
{
	public static void main(String[] args) 
	{
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1==s2);
		System.out.println(s1.Equals(s2));
		
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		
		
		
		
		
	}

}
