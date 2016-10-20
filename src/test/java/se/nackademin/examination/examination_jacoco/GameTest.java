package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GameTest {
	private Game game = new Game();
	

	@Test
	public void testCalculateOutPutBasedOnNames() {
		
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
		
		int j = game.calculateOutPutBasedOnNames("Rafael", "Silvason");
		assertEquals("The result should be 0", j, 0);
		
		int k = game.calculateOutPutBasedOnNames("Rafael", "Silvas");
		assertEquals("The result should be 2", k, 2);
	}

	@Test
	public void testCalculateOutPutBasedOnGender(){
		
		int i = 0;
		assertEquals(i,game.calculateOutPutBasedOnGender('M'));
	
		int j = 1;
		assertEquals(j,game.calculateOutPutBasedOnGender('F'));
	
		int k = 2;
		assertEquals(k,game.calculateOutPutBasedOnGender('A'));
	}
	
	@Test
	public void testCalculateOutPutBasedOnAge(){
		
		int i = 0;
		assertEquals(i,game.calculateOutPutBasedOnAge(20));
		
		int j = 1;
		assertEquals(j,game.calculateOutPutBasedOnAge(50));
	}
	
	@Test
	public void testCalculateOutPutBasedOnHomeCity(){
		
		int i = 0;
		String cityName = "Amsterdam";
		assertEquals(i, game.calculateOutPutBasedOnHomeCity(cityName));
	
		i = 1;
		cityName = "Belgrad";
		assertEquals(i, game.calculateOutPutBasedOnHomeCity(cityName));
		
		i = 2;
		cityName = "Chicago";
		assertEquals(i, game.calculateOutPutBasedOnHomeCity(cityName));
	
		i = 3;
		cityName = "Dimitrovgrad";
		assertEquals(i, game.calculateOutPutBasedOnHomeCity(cityName));
		
		i = 4;
		cityName = "Elefant";
		assertEquals(i, game.calculateOutPutBasedOnHomeCity(cityName));
		
		i = 5;
		cityName = "Florence";
		assertEquals(i, game.calculateOutPutBasedOnHomeCity(cityName));
		
		i = 6;
		cityName = "Göteborg";
		assertEquals(i, game.calculateOutPutBasedOnHomeCity(cityName));
		
		i = 7;
		cityName = "Halmstad";
		assertEquals(i, game.calculateOutPutBasedOnHomeCity(cityName));
		
		i = 8;
		cityName = "Ivanjica";
		assertEquals(i, game.calculateOutPutBasedOnHomeCity(cityName));
		
		i = 9;
		cityName = "Jönköping";
		assertEquals(i, game.calculateOutPutBasedOnHomeCity(cityName));
	
		i = 10;
		cityName = "Örebro";
		assertEquals(i, game.calculateOutPutBasedOnHomeCity(cityName));
		
	}
	
	@Test
	public void testGetGenderFromInputValues(){
		char c = 'M';
		ArrayList<String> myArray = new ArrayList<String>();
		myArray.add("Game X");
		myArray.add("Rafael");
		myArray.add("Silva");
		myArray.add("M");
		assertEquals(c, game.getGenderFromInputValues(myArray));
	}
	
	@Test
	public void testGetAgeFromInputValues(){
		int i = 25;
		ArrayList<String> myArray = new ArrayList<String>();
		myArray.add("Game X");
		myArray.add("Rafael");
		myArray.add("Silva");
		myArray.add("M");
		myArray.add("25");
		assertEquals(i, game.getAgeFromInputValues(myArray));
	}
	
	@Test
	public void testBuildFinalString(){
		
		Conversor conv = new Conversor ();
		ResultFromInputs rfi = new ResultFromInputs();
		game.buildFinalString("Lisa", "Svensson", rfi, conv);
		
	}
	
	@Test
	
	public void testRun (){
		
		ArrayList<String> myArray = new ArrayList<String>();
		myArray.add("Game X");
		myArray.add("Rafael");
		myArray.add("Silva");
		myArray.add("M");
		myArray.add("25");
		myArray.add("Solna");
		
		game.run(myArray);
	
	}
	
	
	
	
	
	
	
	
	
}
