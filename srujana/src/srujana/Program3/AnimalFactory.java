package srujana.Program3;


public class AnimalFactory 
{
	public  Animal getAnimal(String type)
	{
		Animal a; //interface type ref var
		
		if(type == null)
		{
			a = null;
		}
		else if(type.equalsIgnoreCase("Dog"))
		{
			a = new Dog();
		}
		else if(type.equalsIgnoreCase("Cat"))
		{
			a = new Cat();
		}
		else
		{
			a = new Monkey();
		}
		
		return a;//interface type
	}

}
