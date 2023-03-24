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
	
	@Test //3.2
	void testCompareTo () {
		assertTrue("Test 3.2".compareTo("Test")>0);
		assertFalse("test 3.2".compareTo("Test 3.2")<0);
		assertEquals(0, "Test 3.2".compareTo("Test 3.2"));
	}
	
	@Test //3.3
	void testCompareToIgnoreCase () {
		assertEquals(0,"Test 3.3".compareToIgnoreCase("test 3.3"));
		assertTrue("Test 3.3".compareToIgnoreCase("Test 3.2")>0);
		assertFalse("Test 3.3".compareToIgnoreCase("Test 3.2")<0);
	}
@Test //3.4
void testConcat () {
	assertEquals("Test 3.4 concat", "Test 3.4 ".concat("concat"));
	
}
    @Test //3.5
    void testStartWith () {
    assertTrue("Test 3.5".startsWith("T"));
    assertFalse("Test 3.5".startsWith("tes"));
    
    }
    @Test //3.6
    void testEendWith () {
    	assertTrue("Test".endsWith("st"));
    	assertFalse("Test 3.6".endsWith("6."));
    }
    @Test //3.7
    void testContains () {
    	assertTrue("Test 3.7".contains(" "));
    	assertFalse("Test 3.7".contains("3.7."));
    }
    @Test //3.8
    void testIndexOf () {
    	assertEquals(-1, "Test 3.8".indexOf("Es"));
    	assertEquals(5, "Test 3.8".indexOf("3."));
    	assertEquals(0,"test 3.8 + test 3.9".indexOf("test"));
    }
    @Test //3.9
    void lastIndexOf () {
    	assertEquals(-1, "Test 3.9".lastIndexOf("S"));
    	assertEquals(2, "Test 3.9".lastIndexOf("s"));
    	assertEquals(14,"test 3.8 + test 3.9".lastIndexOf("t"));
    }
}
