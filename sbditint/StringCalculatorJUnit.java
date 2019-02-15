package sbditint;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorJUnit {
	StringCalculator calc;
	
	@Before	
	public void setup() {
		calc = new StringCalculator();
	}
	
	@Test
	public void emptryStringTest() throws Exception {
		assertEquals(0, calc.add(""));

	}
	
	@Test
	public void oneNumber() throws Exception {
		assertEquals(5, calc.add("5"));
	}
	
	@Test
	public void twoNumbers() throws Exception {
		assertEquals(10, calc.add("3,7"));
	}
	
	@Test
	public void fourNumbers() throws Exception {
		assertEquals(24, calc.add("3,7,4,10"));
	}
	
	@Test
	public void negativeNumber() throws Exception{
		try {
			calc.add("-1");
		}
		catch(Exception negative){
			assertEquals("no negative numbers -1", negative.getMessage());
		}
	}
	
	@Test
	public void negativeNumbers() throws Exception{
		try {
			calc.add("-1, -2");
		}
		catch(Exception negative) {
			assertEquals("no negative numbers -1 -2", negative.getMessage());
		}
	}
	
	
}
