package virtualpetshelter;

public class OrgDog extends Organic{

	

	
	public OrgDog(String name, String description, int boredom, int thirst, int hunger, int health) {
		super(name,description,health, boredom, thirst, hunger);
		OrgDog.waste = waste;
	}

	
	public void walkOrgDog() {
		thirst += 5;
		health += 5;
		waste -= 15;
		
	}
	
	
}
