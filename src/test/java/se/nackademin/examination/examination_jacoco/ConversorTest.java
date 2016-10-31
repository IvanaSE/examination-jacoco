package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class ConversorTest {

	private Conversor conversor = new Conversor();
	
	
	@Test
	public void testConversor() {
		
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
	}
	
	@Test
	public void testSetAndGetGenderConverterArrayValues(){
		conversor.setGenderConverterArrayValues();
		assertEquals(conversor.getGenderConverterArray().get(0), "man!" );
		assertEquals(conversor.getGenderConverterArray().get(1), "woman!" );
	}
	
	@Test
	public void testSetAndGetAgeConverterArrayValues(){
		conversor.setAgeConverterArrayValues();
		Assert.assertTrue(conversor.getAgeConverterArray().get(0).contains("young"));
	}
	
	@Test
	public void testSetAndGetCityConverter (){
		conversor.setCityConverterArrayValues();
		assertEquals(conversor.getCityConverterArray().get(0), " A, ");
	}

}
