package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

public class ResultsFromInputsTest {
	ResultFromInputs resultsFromInputs = new ResultFromInputs();
	
	@Test
	public void testNameLengthGettersAndSettersMethods() {
		resultsFromInputs.setResultForNameLenght(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForNameLenght(), 10);
	}

	@Test
	public void testGenderGettersAndSettersMethods() {		
		resultsFromInputs.setResultForGender(1);
		assertEquals("The result should be 1", resultsFromInputs.getResultForGender(), 1);
	}
	
	@Test
	public void testAgeGettersAndSettersMethods(){
		resultsFromInputs.setResultForAge(25);
		assertEquals("The result should be 25", resultsFromInputs.getResultForAge(), 25);
	}
	
	@Test
	public void testHomeCityGettersAndSettersMethods(){
		resultsFromInputs.setResultForHomeCity(22);
		assertEquals("The result should be 22", resultsFromInputs.getResultForHomeCity(), 22);
	}

	
}
