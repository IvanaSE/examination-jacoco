package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
	Game game = new Game();
	

	@Test
	public void testMethod1() {
		
		int i = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", i, 1);
		
		int j = game.calculateOutPutBasedOnNames("Rafael", "Silvason");
		assertEquals("The result should be 0", j, 0);
		
		int k = game.calculateOutPutBasedOnNames("Rafael", "Silvas");
		assertEquals("The result should be 2", k, 2);
	}

}
