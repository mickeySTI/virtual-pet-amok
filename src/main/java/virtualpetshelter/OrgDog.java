package virtualpetshelter;

public class OrgDog extends Organic{
	

	
	public OrgDog(String name, String description, int boredom, int thirst, int hunger, int health, int cageCleanliness) {
		super(name,description,health, boredom, thirst, hunger);
		cageCleanliness = cageCleanliness;
	}
	

	
	public void walkOrgDog() {
		thirst += 5;
		health = getHealth() + 5;
		cageCleanliness += 8;
		
	}
	
	public int getCageStatus() {
		return cageCleanliness;
	}
	

	
	
	
	
}
