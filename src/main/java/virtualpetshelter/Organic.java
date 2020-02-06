package virtualpetshelter;

public class Organic extends VirtualPet{
	
	public int thirst;
	public static int waste;
	public int hunger;

	

	public Organic(String name, String description, int boredom, int thirst, int hunger, int health){
		super(name,description,health);
		
	}
	


	public void cleanedOrganicCages() {
		waste -= 20;
		health += 10;
	
	}

}
