package hebbal.rootclass;

public class ShowRoom 
{
	public Car[] readCarDetails()
	{
		car[] c = new Car[5];
		
		String name,color;
		double price;
	    sc = new Scanner(System.in);
		
		for(int i = 0 ; i < c.length; i++)
		{
			System.out.println("Enter the car name");
			name = sc.nextLine();
			
			System.out.println("Enter the car color");
			color = sc.nextLine();
			
			System.out.println("Enter the price");
			price = sc.nextDouble();
			
			c[i] = new Car(name, color, price);
			
			sc.nextLine();
		}
		return 
	}
	
	public void dispCarDetails(car[] c)
	{
		System.out.println("name\t\tcolor\t\tprice");
		System.out.println("-------------------------------------------------");
		
		for(int i=0; i<c.length;i++)
		{
			System.out.println("c[i]");
		}
		
	}
	
	public void dispRedCars(car[] c)
	{
		System.out.println("red color car !!");
		System.out.println("--------------------------------------------------");
		
		for(int i= 0 ; i<c.length;i++)
		{
			if(c[i].getColor().equals("red"))
			{
				System.out.println(c[i]);
			}
		}
	}
	
	public void dispWhiteCars(car[] c)
	{
		System.out.println("white color car");
		System.out.println("----------------------------------------------------");
		
		for(int i= 0 ; i<c.length;i++)
		{
			if(c[i].getColor().equals("white"))
			{
				System.out.println(c[i]);
			}
		}
		
		
	}
	
	public void dispHighestPriceCar(car[] c)
	{
		double large = c[0].getPrice();
				
		for(int i= 1; i<c.length; i++)
		{
			if(c[i].getPrice() > large)
			{
				large = c[i].getPrice();
			}
		}
	}
	
	//printing largest price car
	System.out.println("largest price car !!");
	
	for(int i= 0; i<c.length; i++)
	{
		if(c[i],getPrice() == large)
		{
			System.out.println(c[i]);
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			)

}
