package is.ru.stringcalculator;


import static org.junit.Assert.assertEquals;


import org.junit.Test;


public class CalculatorTest {

	@Test
	public void testEmpty() {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOne() {
		assertEquals(1, Calculator.add("1"));
	}



}

