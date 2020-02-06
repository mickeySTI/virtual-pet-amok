import static org.junit.Assert.*;

import org.junit.Test;

import virtualpetshelter.VirtualPet;

public class VirtualPetTest {
	
	//**Beginning of Testing Functions 
	//Arrange
	VirtualPet underTest = new VirtualPet(""," ","");
	@Test
	public void hungerShouldDecreaseBy12AfterFeed() {
		//Act
		int beforeFeed = underTest.getHunger();
		underTest.feed();
		int afterFeed = underTest.getHunger();
		//Assert
		assertEquals(beforeFeed-12, afterFeed);
	}	
	@Test
	public void thirstShouldDecreaseBy12AfterDrink() {
		//Act
		int beforeDrink = underTest.getThirst();
		underTest.drink();
		int afterDrink = underTest.getThirst();
		//Assert
		assertEquals(beforeDrink-12, afterDrink);
	}	
	@Test
	public void boredemShouldDecreaseBy12AfterPlay() {
		//Act
		int beforePlay = underTest.getBoredom();
		underTest.play();
		int afterPlay = underTest.getBoredom();
		//Assert
		assertEquals(beforePlay-12, afterPlay);
	}	
	@Test
	public void boredemDecreasesby12AfterTakingAWalk() {
		//Act
		int beforeWalk = underTest.getBoredom();
		underTest.walk();
		int afterWalk = underTest.getBoredom();
		//Assert
		assertEquals(beforeWalk-12, afterWalk);
	}	
	@Test
	public void HungerIncreaseBy12AfterTakingAWalk() {
		//Act
		int beforeWalk = underTest.getBoredom();
		underTest.walk();
		int afterWalk = underTest.getBoredom();
		//Assert
		assertEquals(beforeWalk-12, afterWalk);
	}	
	 
	
	//** End of Testing Functions **
	
	
	//Testing Constructor

	@Test
	public void constructorShouldAllowNameParam() {
		VirtualPet underTestConstructor = new VirtualPet("","name","");
		String result = underTestConstructor.getName();
		assertTrue(result.contentEquals("name"));		
	}
	
	@Test
	public void constructorShouldAllowDescriptionParam() {
		VirtualPet underTestConstructor = new VirtualPet("","","description");
		String result = underTestConstructor.getDescription();
		assertTrue(result.contentEquals("description"));		
	}	
	
	
}
