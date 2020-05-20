package ban.rootclass;

public class objectDemo1 
{
	public static void main(String[] args) 
	{
		watch w1 = new watch(10,20,13);
		watch w2 = new watch(11,12,45);
		System.out.println(w1.equals(w2));
		System.out.println(w1);
		System.out.println(w2);
	}

}
