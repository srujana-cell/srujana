package srujana.Program3;

public class Animalsound 
{
	/*tight coupled methods
	public void animalVoice(Dog d)
	{
		d.sound();
	}
	public void animalVoice(Dog d)
	{
		d.sound();
	}
	public void animalVoice(Dog d)
	{
		d.sound();
	}  
	*/
	
	
	//loose coupled method
	public void animalVoice(Animal a)//a is interface 
	{
		a.sound();
	}
	
	
	



}
