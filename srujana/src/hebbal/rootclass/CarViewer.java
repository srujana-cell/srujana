package hebbal.rootclass;

public class CarViewer 
{
	public static void main(String[] args) 
	{
		ShowRoom sr = new ShowRoom();
		
		System.out.println(sr.getClass().getName());
		
		Car[] c = sr.readCarDetails();
		
		sr.dispCarDetails(c);
		sr.dispRedCars(c);
		sr.dispWhiteCars(c);
		sr.dispHighestPriceCar(c);
		
		
	}

}
