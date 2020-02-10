package virtualpetshelter;

public class VirtualPet {

	private int hunger = (int) (Math.random() * 51) + 0;;
	private int thirst = (int) (Math.random() * 51) + 0;;
	private int boredom = (int) (Math.random() * 51) + 0;;
	private String name;
	private String description;
	protected int cageCleanliness = 50;
	 protected int litterBox = 50;
	 protected int health = 50;

	public VirtualPet(String name, String description, int health) {
		this.name = name;
		this.description = description;
		health = health;
	}

	public int getHealth() {
		return health;
	}

	public int getHunger() {
		return this.hunger;
	}

	public int getThirst() {
		return this.thirst;
	}

	public int getBoredom() {
		return this.boredom;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void feed() {
		hunger += 12;
	}

	public void drink() {
		thirst += 12;

	}

	public void play() {
		boredom += 12;
		thirst -= 12;
		health = getHealth() + 3;

	}

	public void walk() {
		boredom += 12;
		hunger -= 12;
		health = getHealth() + 3;

	}

	// tick for Organic Pets

	public void tick() {

		health = getHealth();
		if (getHealth() < 0) {
			health = 0;
		}
		if (getHealth() > 50) {
			health = 50;
		}
		cageCleanliness -= 8;
		if (cageCleanliness < 0) {
			cageCleanliness = 0;
		}
		if (cageCleanliness > 50) {
			cageCleanliness = 50;

		}
		
		
		litterBox -= 8;
		if (litterBox < 0) {
			litterBox = 0;
		}
		if (litterBox > 50) {
			litterBox = 50;
		}
	
		this.hunger -= 8;
		if (this.hunger < 0) {
			this.hunger = 0;
		}
		if (this.hunger > 50) {
			this.hunger = 50;
		}

		this.thirst -= 8;
		if (this.thirst < 0) {
			this.thirst = 0;
		}
		if (this.thirst > 50) {
			this.thirst = 50;
		}

		this.boredom -= 8;
		if (this.boredom < 0) {
			this.boredom = 0;
		}
		if (this.boredom > 50) {
			this.boredom = 50;

		}
		
		
		Robotic.oilLevel -=8;
		if (Robotic.oilLevel < 0) {
			Robotic.oilLevel = 0;
		}
		if (Robotic.oilLevel > 50) {
			Robotic.oilLevel = 50;

		}
		
		
		
		
		

	}

}
