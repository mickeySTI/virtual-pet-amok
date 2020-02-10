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
		while (userOptions != "10") {
			showOptions();
			userOptions = input.nextLine();
			
			switch (userOptions) {
			case "1":
				System.out.println("You fed all the organic pets!\n");
				shelter.feedAll(petsInShelter);
				shelter.oragnicPetStatusDisplay(petsInShelter);
				shelter.tickAll(petsInShelter);
				break;

			case "2":
				System.out.println("You gave all the organic pets water to drink!\n");
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
					petDescription = petDescription.toLowerCase();
					while(!(petDescription.equals("dog") || petDescription.equals("cat"))) {
						System.out.println("Please enter either dog or cat.");
						 petDescription = input.nextLine();
						 }
					System.out.println("Is the new pet organic or a robot?");
					String petType = input.nextLine();
					petType = petType.toLowerCase();
					while(!(petType.equals("robot") ||petType.equals("organic"))) {
						System.out.println("Please enter either organic or robot.");
						 petType = input.nextLine();
					}
					if(petDescription.equals("dog") && petType.equals("organic")) {
						shelter.addNewPet(new OrgDog(petName, petDescription, 0, 0, 0, 0, 0));
						shelter.tickAll(petsInShelter);
					}
					else if(petDescription.equals("dog") && petType.equals("robot")) {
						shelter.addNewPet(new RoboDog(petName, petDescription, 0, 0));
						shelter.tickAll(petsInShelter);
					}
					else if(petDescription.equals("cat") && petType.equals("organic")) {
						shelter.addNewPet(new OrgCat(petName, petDescription, 0, 0, 0, 0, 0));
						shelter.tickAll(petsInShelter);
					}
					else {
						shelter.addNewPet(new RoboCat(petName, petDescription, 0, 0));
						shelter.tickAll(petsInShelter);
					}
					System.out.println("You took in " + petName +"!");
					shelter.tickAll(petsInShelter);
					break;
			case "6":
					shelter.oilChangeAllRoboticPets(petsInShelter);
					System.out.println("All the robotic pets just got some fresh synthetic oil!\n");
					shelter.roboticPetStatusDisplay(petsInShelter);
					shelter.tickAll(petsInShelter);
					break;
			case "7":
				System.out.println("\nOrganic Pets");
				shelter.oragnicPetStatusDisplay(petsInShelter);
				System.out.println("\nRobot Pets");
				shelter.roboticPetStatusDisplay(petsInShelter);
				break;
			
			case "8":
				System.out.println("Here is the status of the cages for the dogs!");
				shelter.dogCageStatusDisplay(petsInShelter);
				System.out.println("\nWould you like to clean out the cages? (Yes/No)");
				String cageInput = input.nextLine();
				cageInput = cageInput.toLowerCase();
				while(!(cageInput.equals("yes") || cageInput.equals("no"))) {
					System.out.println("Please enter yes or no");
					cageInput = input.nextLine();
				}
				if(cageInput.equals("yes")) {
					shelter.CleanOrganicDogCages(petsInShelter);
					System.out.println("You cleaned all the cages!");
				}
				else {
					break;
				}
			case "9":
					System.out.println("Here is the status of the cat's litterbox");
					shelter.catLitterBoxDisplay(petsInShelter);
					System.out.println("\nWould you like to clean out the litter boxes? (Yes/No)");
					String litterInput = input.nextLine();
					litterInput = litterInput.toLowerCase();
					while(!(litterInput.equals("yes") || litterInput.equals("no"))) {
						System.out.println("Please enter yes or no");
						cageInput = input.nextLine();
					}
					if(litterInput.equals("yes")) {
						shelter.CleanOrganicDogCages(petsInShelter);
						System.out.println("You cleaned all the cages!");
					}
					else {
						break;
					}
			case "10":
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
		System.out.println("8. Check cages");
		System.out.println("9. Check litter boxes");
		System.out.println("10. Quit");

	}

	

}
