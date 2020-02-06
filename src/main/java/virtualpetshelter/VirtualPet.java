package virtualpetshelter;

public class VirtualPet {

	private int hunger = (int) (Math.random() * 51) + 0;;
	private int thirst = (int) (Math.random() * 51) + 0;;
	private int boredom = (int) (Math.random() * 51) + 0;;
	private String name;
	private String description;
	protected static int health = 50;

	public VirtualPet(String name, String description, int health) {
		this.name = name;
		this.description = description;
		VirtualPet.health = health;
		
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
		hunger -= 12;
	}

	public void drink() {
		thirst -= 12;

	}

	public void play() {
		boredom -= 12;

	}

	public void walk() {
		boredom -= 12;
		hunger += 12;

	}
	
	//tick for Organic Pets

	public void tick() {
		
		this.health -= 3;
		
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

		VirtualPetShelter.litterBox += 12;
	}




}
