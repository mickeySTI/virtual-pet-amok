package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	
	public static int litterBox;
	int cageCleanliness;
	
	
	private Map<String, VirtualPet> shelter = new HashMap<String, VirtualPet>();

	public int getLitter() {
		return litterBox;
	}
	

	
	
	public Collection<VirtualPet> getAllPets() {
		return shelter.values();
	}

	public VirtualPet selectPet(String name) {
		return shelter.get(name);
		
	}

	public void addNewPet(VirtualPet pet) {
		shelter.put(pet.getName(), pet);
	}

	public void adopt(String petName) {
		this.shelter.remove(petName);
	}

	public static void feedAll(Collection<VirtualPet> virtualPets) {
		for (VirtualPet pet : virtualPets) {
			if (pet instanceof Organic) {
				((Organic) pet).feed();
			}
		}
			
	}

	public static void drinkAll(Collection<VirtualPet> virtualPets) {
		for (VirtualPet pet : virtualPets) {
			if (pet instanceof Organic) {
				((Organic) pet).drink();{
		
				}
		
			}
		}
	}
	
	
	
	public static void WalkAllDogs(Collection<VirtualPet> virtualPets) {
		for (VirtualPet pet : virtualPets) {
			if (pet instanceof OrgDog) {
				((OrgDog) pet).walkOrgDog();
			} else if (pet instanceof RoboDog) {
				((RobocDog) pet).walkRoboDog();
			} else {
			}

		}

	}
	
	
	
	
	public static void CleanOrganicDogCages(Collection<VirtualPet> virtualPets){
		for (VirtualPet pet : virtualPets) {
			if (pet instanceof Organic) {
				((Organic) pet).cleanedOrganicCages();
			}
		}
	}
	
	
	
	
	
	
	
	// To pick one specific pet
	public void playWithAPet(String name) {
		selectPet(name).play();
	}

	public void tickAll(Collection<VirtualPet> virtualPets) {
		for (VirtualPet pet : virtualPets) {
			pet.tick();
		}
	}
	
	
	
	
	

	// Display Screen
	public void petStatusDisplay(Collection<VirtualPet> virtualPets) {
		System.out.println("Name	|Hunger	|Thirst	|Boredom\r\n" + "--------|-------|-------|-------");
		for (VirtualPet pet : virtualPets) {
			System.out.println(
					pet.getName() + "\t|" + pet.getHunger() + "\t|" + pet.getThirst() + "\t|" + pet.getBoredom());
		}
	}



}
