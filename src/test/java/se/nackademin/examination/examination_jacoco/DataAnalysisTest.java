package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {
	
	private DataAnalysis dataAnalysis = new DataAnalysis();
	private ArrayList<String> values = new ArrayList<String>();
	private ArrayList<String> values1 = new ArrayList<String>();
	private ArrayList<String> values2 = new ArrayList<String>();
	private ArrayList<String> values3 = new ArrayList<String>();
	Game game = new Game ();
	private String result = "";
	private String result1  = "";
	private String result2  = "";
	private String result3  = "";
	
	@Test
	public void testBuildFinalString() {
		
		values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
		result = dataAnalysis.buildFinalString(values);
		assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
				result.contains("The name of the homecity is big and the participant is 30 or older"));

	}
	
	@Test
	public void testGetResultStringNamesAndAge(){
		values.addAll(Arrays.asList("Game", "Rafael", "Silvason", "M", "20", "Fortaleza"));
		result = dataAnalysis.getResultStringNamesAndAge(values);
		assertEquals(result.contains("first name is smaller"),true);
		
		values1.addAll(Arrays.asList("Game", "Rafaelito", "Silva", "M", "35", "Fortaleza"));
		result1 = dataAnalysis.getResultStringNamesAndAge(values1);
		assertEquals(result1.contains("first name is greater"),true);
		
		values2.addAll(Arrays.asList("Game", "Rafaelito", "Silva", "M", "20", "Fortaleza"));
		result2 = dataAnalysis.getResultStringNamesAndAge(values2);
		assertEquals(result2.contains("No analysis"),true);
		
		values3.addAll(Arrays.asList("Game", "Rafael", "Silvason", "M", "40", "Fortaleza"));
		result3 = dataAnalysis.getResultStringNamesAndAge(values3);
		assertEquals(result3.contains("No analysis"),true);
		
		
	}
	
	@Test
	public void testGetResulStringHomecityAndAge(){
		values.addAll(Arrays.asList("Game", "Rafael", "Silvason", "M", "20", "Fort"));
		result = dataAnalysis.getResulStringHomecityAndAge(values);
		assertEquals(result.contains("homecity is small and the participant is younger"),true);
		
		values1.addAll(Arrays.asList("Game", "Rafaelito", "Silva", "M", "35", "Fort"));
		result1 = dataAnalysis.getResulStringHomecityAndAge(values1);
		assertEquals(result1.contains("homecity is small and the participant is 30"),true);
		
		values2.addAll(Arrays.asList("Game", "Rafaelito", "Silva", "M", "20", "Fortaleza"));
		result2 = dataAnalysis.getResulStringHomecityAndAge(values2);
		assertEquals(result2.contains("homecity is big and the participant is younger"),true);
		
		values3.addAll(Arrays.asList("Game", "Rafael", "Silvason", "M", "40", "Fortaleza"));
		result3 = dataAnalysis.getResulStringHomecityAndAge(values3);
		assertEquals(result3.contains("homecity is big and the participant is 30"),true);
	}
	
}
