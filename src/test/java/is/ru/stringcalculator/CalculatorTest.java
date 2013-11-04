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
		assertEquals(3, Calculator.add("3"));
	}

	@Test
	public void testTwo() {
		assertEquals(4, Calculator.add("2,2"));
	}

	@Test
	public void testThree() {
		assertEquals(7, Calculator.add("2,1,4"));
	}

	@Test
	public void testFour() {
		assertEquals(10, Calculator.add("1,2,3,4"));
	}



}

