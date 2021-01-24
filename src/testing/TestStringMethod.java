package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import utility.StringMethod;

public class TestStringMethod {
	StringMethod sm = new StringMethod();

	@Test
	public void testSetInputsMethod() {
		sm.setInput("Java");
		assertEquals("Java", sm.getInput());
		try {
			sm.setInput(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testLowerMethod() {
		assertEquals("hai", sm.toLower("HaI"));
		assertEquals("1234", sm.toLower("1234"));
		assertEquals("hai&hello", sm.toLower("hai&HELLO"));
		assertEquals("welcome", sm.toLower("welcome"));
		try {
			sm.toLower("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testUpperMethod() {
		assertEquals("HAI", sm.toUpper("HAI"));
		assertEquals("1234", sm.toUpper("1234"));
		assertEquals("HAI&HELLO", sm.toUpper("hai&HELLO"));
		assertEquals("WELCOME", sm.toUpper("welcome"));
		try {
			sm.toUpper("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testFirstCharacterMethod() {
		assertEquals("1", sm.firstChar("1.hai"));
		assertEquals("@", sm.firstChar("@hai"));
		assertEquals(" ", sm.firstChar(" hai"));
		assertEquals("h", sm.firstChar("hai"));
		try {
			sm.firstChar(" ");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testLengthMethod() {
		assertEquals("0", sm.length(""));
		assertEquals("15", sm.length(" WelcomeToJava "));
		assertEquals("4", sm.length("123 "));
		assertEquals("1", sm.length("."));
		try {
			sm.length("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}

	@Test
	public void testTrimMethod() {
		assertEquals("Java", sm.trim(" Java "));
		assertEquals("Ja va", sm.trim("Ja va "));
		assertEquals("Java", sm.trim("  Java  "));
		try {
			sm.trim("");
		} catch (IllegalArgumentException e) {
			// System.out.println("No input is given");
			e.printStackTrace();
		}
	}
}
