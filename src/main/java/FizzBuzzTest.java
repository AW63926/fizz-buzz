import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	
	FizzBuzz underTest = new FizzBuzz();
	
	

	@Test
	public void shouldReturn1for1() {
		
		//Act will is return a value of 1 if 1 is entered
		String result = underTest.getResult(1);
		//Assertion
		assertEquals("1", result);
			
	}
	@Test
	public void return2For2() {
		String result = underTest.getResult(2);
		//Assertion
		assertEquals("2", result);
	}
	
	
	@Test
	public void fizzTest() {
		String result = underTest.getResult(3);
		//Assertion
		assertEquals("Fizz", result);
	}
	
	@Test
	public void buzzTest() {
		String result = underTest.getResult(5);
		//Assertion
		assertEquals("Buzz", result);
	}
	@Test 
	public void twelveTest() {
		String result = underTest.getResult(11);
		assertEquals("11", result);
	}
	
	@Test
	public void fizzBuzzTest() {
		String result = underTest.getResult(15);
		assertEquals("FizzBuzz", result);
	}
	@Test
	public void numberTest() {
		for(int i = 0; i <=100; i++) {
			String result = underTest.getResult(i);
			if(i % 3 == 0 && i % 5 == 0) {
				assertEquals("FizzBuzz", result);
			}
			else if(i % 3 == 0) {
				assertEquals("Fizz", result);
			}
			else if(i % 5 == 0) {
				assertEquals("Buzz", result);
			}
			else {
				assertEquals(i, Integer.parseInt(result));
			}
		}
	}

}
