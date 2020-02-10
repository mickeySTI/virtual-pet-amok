package virtualpetshelter;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		
		VirtualPetShelter shelter = new VirtualPetShelter();
		Collection<VirtualPet> petsInShelter = shelter.getAllPets();
		
	
		
		OrgDog fluffy = new OrgDog("Fluffy","dog",0, 0, 0, 0, 0);
		OrgCat mechew = new OrgCat("Mechew", "cat", 0, 0, 0, 0, 0);
		RoboCat talion = new RoboCat("Talion", "", 0, 0);
		
		
		shelter.addNewPet(fluffy);
		shelter.addNewPet(mechew);
		shelter.addNewPet(talion);
		
		Scanner input = new Scanner(System.in);


		String userOptions = "0";


		System.out.println("What would you like to do with the pets?");
		while (userOptions != "9") {
			showOptions();
			userOptions = input.nextLine();
			
			switch (userOptions) {
			case "1":
				System.out.println("You fed all the pets.\n");
				shelter.feedAll(petsInShelter);
				shelter.tickAll(petsInShelter);
				shelter.oragnicPetStatusDisplay(petsInShelter);
				break;

			case "2":
				System.out.println("You gave all the pets water to drink.\n");
				shelter.drinkAll(petsInShelter);
				shelter.tickAll(petsInShelter);
				shelter.oragnicPetStatusDisplay(petsInShelter);
				break;
			case "3": 
				System.out.println("Which pet would you like to play with?");
				displayJustThePets(petsInShelter);
				String playPet = input.nextLine();
				shelter.playWithAPet(playPet);
				System.out.println("\nYou played with " + playPet+"!");
				break;
			case "4":
				System.out.println("Which pet would you like to adopt");
				displayJustThePets(petsInShelter);
				String adoptee = input.nextLine();
				System.out.println("\n"+adoptee +" has been adopted!");
				shelter.adopt(adoptee);
				shelter.tickAll(petsInShelter);
				break;
			case "5":
					System.out.println("Please give the new pet a name: ");
					String petName = input.nextLine();
					System.out.println("Is the new pet a dog or cat?: ");
					String petDescription = input.nextLine();
					while(!petDescription.toLowerCase().equals("dog") ||!petDescription.toLowerCase().equals("cat") )
						System.out.println("Please enter either dog or cat.");
						 petDescription = input.nextLine();
					System.out.println("Is the new pet organic or a robot?");
					String petType = input.nextLine();
					while(!petType.toLowerCase().equals("robot") ||!petDescription.toLowerCase().equals("organic") )
						System.out.println("Please enter either dog or cat.");
						 petType = input.nextLine();
	 
					if(petDescription.toLowerCase().equals("dog") && petType.toLowerCase().equals("organic")) {
						shelter.addNewPet(new OrgDog(petName, petDescription, 0, 0, 0, 0, 0));
					}
					else if(petDescription.toLowerCase().equals("dog") && petType.toLowerCase().equals("robot")) {
						shelter.addNewPet(new RoboDog(petName, petDescription, 0, 0));
					}
					else if(petDescription.toLowerCase().equals("cat") && petType.toLowerCase().equals("organic")) {
						shelter.addNewPet(new OrgCat(petName, petDescription, 0, 0, 0, 0, 0));
					}
					else {
						shelter.addNewPet(new RoboCat(petName, petDescription, 0, 0));
					}
					System.out.println("You took in " + petName +"!");
					shelter.tickAll(petsInShelter);
					break;
			case "6":
					shelter.oilChangeAllRoboticPets(petsInShelter);
					System.out.println("All the robotic pets just got some fresh synthetic oil!");
				
			case "7":
				System.out.println("Organic Pets");
				shelter.oragnicPetStatusDisplay(petsInShelter);
				System.out.println("\nRobot Pets");
				shelter.roboticPetStatusDisplay(petsInShelter);
				break;
				
			case "8":
				System.exit(0);
			
			default:
				System.out.println("\nIncorrect option");
				System.out.println();
				System.out.println("Please choose between 0-5\n");
				System.out.println();
			}
		}
		
		input.close();
	}

	private static void displayJustThePets(Collection<VirtualPet> virtualPets) {
		for (VirtualPet pet : virtualPets) {
			System.out.println(pet.getName());
		}	
	}

	private static void showOptions() {

		System.out.println("\n");
		System.out.println("1. Feed the pets");
		System.out.println("2. Give the pets water");
		System.out.println("3. Play with a Pet");		
		System.out.println("4. Adopt a pet");
		System.out.println("5. Accept a new pet");
		System.out.println("6. Give the robotic pets an oil change");
		System.out.println("7. Show pet status");
		System.out.println("8. Quit");

	}

	

}
