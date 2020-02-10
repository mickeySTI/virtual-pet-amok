package virtualpetshelter;

public class RoboDog extends Robotic {
	

	
	public RoboDog(String name, String description, int health, int oilLevel) {
		super(name, description,health,oilLevel );
	}

	public void walkRoboDog() {;
		health +=  10;
		oilLevel -= 15;
	
}


}
