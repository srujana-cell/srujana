package ban.rootclass;

public class objectDemo 
{
	public static void main(String[] args)
	{
		mobile m1 = new mobile("Apple",60000.00,64);
		mobile m2 = new mobile("Blackberry",70000.00,128);
		
		System.out.println(m1.equals(m1));
		System.out.println(m1.hashCode());
		System.out.println(m1.hashCode());
	}

}
