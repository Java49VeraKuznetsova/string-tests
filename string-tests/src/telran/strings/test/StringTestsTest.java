package telran.strings.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StringTestsTest {

	@Test
	//3.1
	void testCharAt() {
		assertEquals('t', "Test 3.1".charAt(3));
		assertEquals('.', "Test 3.1".charAt(6));
	
	}
	
	@Test  //3.1 Error
	@Disabled
		void testCharAtError () {
		//if Index Negative or > length-1
		assertEquals("Exception", "Test".charAt(4));
		assertEquals("Exception", "Test".charAt(-4));
	}
	
	//from Yuri: In the tests for compareTo / compareToIgnoreCase
// there should be only assertTrue. 
	@Test //3.2
	void testCompareTo () {
		assertTrue("Test 3.2".compareTo("Test")>0);
		assertFalse("test 3.2".compareTo("Test 3.2")<0);
		assertEquals(0, "Test 3.2".compareTo("Test 3.2"));
		// add from Yuri
		assertTrue("Test 3.2".compareTo("test 3.2")!= 0);
		assertTrue("Test 3.2".compareTo("Test 3.2")== 0);
		//Tests from Yuri
		assertEquals(8, "9".compareTo("12345"));
		assertEquals(-4, "12345".compareTo("12349"));
		assertEquals(1, "123459".compareTo("12345"));
		assertEquals(0, "Hello".compareTo("Hello"));
		assertEquals('H' - 'h', "Hello".compareTo("hello"));
		assertTrue("Hello".compareTo("hello") < 0);
	}
	
	@Test //3.3
	void testCompareToIgnoreCase () {
		assertEquals(0,"Test 3.3".compareToIgnoreCase("test 3.3"));
		assertTrue("Test 3.3".compareToIgnoreCase("Test 3.2")>0);
		assertFalse("Test 3.3".compareToIgnoreCase("Test 3.2")<0);
	// add from Valdimir
		assertEquals(0, "Test 3.3".compareToIgnoreCase("Test 3.3"));
		// add from Yuri
		assertTrue("Test 3.3".compareToIgnoreCase("Test 3.3")==0);
		assertTrue("Test 3.3".compareToIgnoreCase("test 3.3")==0);
		// tests from Yuri
		assertEquals(8, "9".compareToIgnoreCase("12345"));
		assertEquals(-4, "12345".compareToIgnoreCase("12349"));
		assertEquals(2, "12345yu".compareToIgnoreCase("12345"));
		assertEquals(0, "Hello".compareToIgnoreCase("HeLlO"));
		assertEquals(0, "Hello".compareToIgnoreCase("hello"));
		
	}
@Test //3.4
void testConcat () {
	assertEquals("Test 3.4 concat", "Test 3.4 ".concat("concat"));
	assertEquals("Test 3.4", "Test 3.4".concat(""));
	//add from Vladimir
	assertEquals("Test 3.4", "".concat("Test 3.4"));
	
}
    @Test //3.5
    void testStartWith () {
    assertTrue("Test 3.5".startsWith("T"));
    assertFalse("Test 3.5".startsWith("tes"));
    //add from Vladimir
    assertTrue("Test 3.5".startsWith(""));
    
    }
    @Test //3.6
    void testEndWith () {
    	assertTrue("Test".endsWith("st"));
    	assertFalse("Test 3.6".endsWith("6."));
    	//add from Vladimir
    	assertTrue("Test 3.6".endsWith(""));
    }
    @Test //3.7
    void testContains () {
    	assertTrue("Test 3.7".contains(" "));
    	assertFalse("Test 3.7".contains("3.7."));
    	//tests from Yuri
    	String hello = "Hello";
    	assertTrue(hello.contains(hello));
    	
    	assertTrue(hello.contains("H"));
    	assertTrue(hello.contains("el"));
    	assertFalse(hello.contains("h"));
    	assertFalse(hello.contains("le"));
    	assertFalse(hello.contains("elo"));
    }
    @Test //3.8
    void testIndexOf () {
    	assertEquals(-1, "Test 3.8".indexOf("Es"));
    	assertEquals(5, "Test 3.8".indexOf("3."));
    	assertEquals(0,"test 3.8 + test 3.9".indexOf("test"));
    }
    @Test //3.9
    //Testing of lastIndexOf there should be for the method lastIndexOf(int ch) but your tests for lastIndexOf(String str). 
    //In Java "t" is a String but 't' is a char
    void testLastIndexOf () {
    	assertEquals(-1, "Test 3.9".lastIndexOf("S"));
    	assertEquals(2, "Test 3.9".lastIndexOf("s"));
    	assertEquals(14,"test 3.8 + test 3.9".lastIndexOf("t"));
    	// add from Yuri
    	assertEquals(-1, "Test 3.9".lastIndexOf('S'));
    	assertEquals(2, "Test 3.9".lastIndexOf('s'));
    	assertEquals(14,"test 3.8 + test 3.9".lastIndexOf('t'));
    }
}
