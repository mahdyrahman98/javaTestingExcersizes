package com.qa.hello;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TempretureTest {

	
	Tempreture temp = new Tempreture();
	
	@Before
	
	public void pretest() {
		
		System.out.println("Before");
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	    public void convertFahrenheitToCelsius() {
	        assertEquals(10, temp.convertFahrenheitToCelsius(50),0);
	        System.out.println("test1");
	    }

	    @Test
	    public void convertCelsiusToFahrenheit() {
	        assertEquals(176, temp.convertCelsiusToFahrenheit(80),0);
	        System.out.println("test2");
	    }

        @Test
	    public void convertKelvinToCelsius() {
	        assertEquals(7, temp.convertKelvinToCelsius(280),0);
	        System.out.println("test3");
	        
	    }

	    @Test
	    public void convertCelsiusToKelvin() {
	        assertEquals(553.0, temp.convertCelsiusToKelvin(280), 0);
	        System.out.println("Test4");
	    }

	    @Test
	    public void convertKelvinToFahrenheit() {
	        assertEquals(80.6,temp.convertKelvinToFahrenheit(300),0);
	        System.out.println("Test5");
	    }

	    @Test
	    public void convertFahrenheitToKelvin() {
	        assertEquals(283.0,temp.convertFahrenheitToKelvin(50),0);
	        System.out.println("Test6");
	    }
	    
	    @After
	    public void posttest() {
	    	
	    	System.out.println("After");
	    }
	    
	    

	
}
