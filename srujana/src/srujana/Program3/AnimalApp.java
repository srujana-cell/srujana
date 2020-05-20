package srujana.Program3;

public class AnimalApp 
{
	public static void main(String[] args) 
	{
		Animalsound as = new Animalsound();
		
		as.animalVoice(new Dog());
		as.animalVoice(new Cat());
		as.animalVoice(new Dogl());
		
	}

}
