package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {


	

	private Map<String, VirtualPet> shelter = new HashMap<String, VirtualPet>();


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

	
	public void feedAll(Collection<VirtualPet> virtualPets) {
		for (VirtualPet pet : virtualPets) {
			if (pet instanceof Organic) {
				((Organic) pet).feed();
			}
		}

	}

	public void drinkAll(Collection<VirtualPet> virtualPets) {
		for (VirtualPet pet : virtualPets) {
			if (pet instanceof Organic) {
				((Organic) pet).drink();
				{

				}

			}
		}
	}

	public void WalkAllDogs(Collection<VirtualPet> virtualPets) {
		for (VirtualPet pet : virtualPets) {
			if (pet instanceof OrgDog) {
				((OrgDog) pet).walkOrgDog();
				((OrgDog) pet).cageCleanliness+=5;
			} else if (pet instanceof RoboDog) {
				((RoboDog) pet).walkRoboDog();
			} else {
			}

		}

	}

	public void CleanOrganicDogCages(Collection<VirtualPet> virtualPets) {
		for (VirtualPet pet : virtualPets) {
			if (pet instanceof Organic) {
				((OrgDog) pet).cleanCages();
			}
		}
	}

	public void oilChangeAllRoboticPets(Collection<VirtualPet> virtualPets) {
		for (VirtualPet pet : virtualPets) {
			if (pet instanceof Robotic) {
				((Robotic) pet).oilChange();
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

	// Display Screens
	public void oragnicPetStatusDisplay(Collection<VirtualPet> virtualPets) {
		System.out.println("Name	|Hunger	|Thirst	|Boredom | Health\r\n" + "--------|-------|-------|-------");
		for (VirtualPet pet : virtualPets) {
			if (pet instanceof Organic) {
				System.out.println(
						pet.getName() + "\t|" + pet.getHunger() + "\t|" + pet.getThirst() + "\t|" + pet.getBoredom() + "\t|" + pet.getHealth());
			} else {

			}
		}
	}
	
	public void dogCageStatusDisplay(Collection<VirtualPet> virtualPets) {
		System.out.println("Name	|Cage Cleanliness\r\n" + "--------|-------|");
		for (VirtualPet pet : virtualPets) {
			if (pet instanceof OrgDog) {
				System.out.println(
						pet.getName() + "\t|" + pet.cageCleanliness + "\t|");
			} else {
				
			}
		}
	}
	
	public void catLitterBoxDisplay(Collection<VirtualPet> virtualPets) {
		System.out.println("Name	|Litter Box\r\n" + "--------|-------|");
		for (VirtualPet pet : virtualPets) {
			if (pet instanceof OrgCat) {
				System.out.println(
						pet.getName() + "\t|" + pet.litterBox + "\t|");
			} else {
				
			}
		}
	}
	
	
	public void roboticPetStatusDisplay(Collection<VirtualPet> virtualPets) {
		System.out.println("Name	|Health	|Boredom |OilLevel\r\n" + "--------|-------|-------|-------");
		for (VirtualPet pet : virtualPets) {
			if (pet instanceof Robotic) {
				System.out.println(
						pet.getName() + "\t|" + pet.getHealth() + "\t|" + pet.getBoredom() + "\t|"+((Robotic) pet).getOilLevel());
			} else {
				
			}
		}
	}
	
	
	
	
	
	
	
	

}
