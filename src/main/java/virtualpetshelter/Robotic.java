package virtualpetshelter;


public class Robotic extends VirtualPet {
	
	protected static int oilLevel = 50;
	
	public Robotic(String name, String description, int health, int oilLevel) {
		super(name,description,health);
	}

	public int getOilLevel() {
		return oilLevel;
	}
	
	public void oilChange(){
		oilLevel = 50;
	}
	
	
	
	

}
