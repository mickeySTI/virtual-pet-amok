package virtualpetshelter;

public class Organic extends VirtualPet{
	
	public int thirst;
	public int hunger;

	public Organic(String name, String description, int boredom, int thirst, int hunger, int health){
		super(name,description,health);
		
	}

	public void cleanCages() {
		cageCleanliness = 50;
		health = getHealth() + 10;
	
	}
	
	
	public void cleanLitterBox() {
		litterBox = 50;
		health = getHealth() + 10;
	}

}
