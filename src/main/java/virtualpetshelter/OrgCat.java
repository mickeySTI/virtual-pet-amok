package virtualpetshelter;

public class OrgCat extends Organic{

	public OrgCat(String name, String description, int boredom, int thirst, int hunger, int health, int litterBox) {
		super(name, description, boredom, thirst, hunger, health);
		litterBox = litterBox;
	}

	
	public int getLitterBoxStatus() {
		return litterBox;
	}
	
	

}
