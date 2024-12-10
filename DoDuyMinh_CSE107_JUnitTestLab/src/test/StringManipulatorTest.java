package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.StringManipulator;

public class StringManipulatorTest {
    StringManipulator stringManipulator = new StringManipulator();

    @Test
    public void testReverse() {
       // Your code here
       assertEquals("ELPmAxE",stringManipulator.reverse("ExAmPLE"));
    }

    @Test
    public void testIsPalindrome() {
       // Your code here
       assertEquals(false,stringManipulator.isPalindrome("example"));
    }

    @Test
    public void testIsContained() {
       // Your code here
       assertEquals(true,stringManipulator.isContained("ExAmPLE","Ex"));

    }

    @Test
    public void testNumberRemoved() {
       // Your code here
       assertEquals("ExAmPLE",stringManipulator.numberRemoved("ExAm1PLE2"));
    }

    @Test
    public void testUpperString() {
       // Your code here
       assertEquals("EXAMPLE",stringManipulator.upperString("ExAmPLE"));
    }

    @Test
    public void testLowerString() {
       // Your code here
       assertEquals("example",stringManipulator.lowerString("ExAmPLE"));
    }

    @Test
    public void testCapitalString() {
       // Your code here
       assertEquals("Example",stringManipulator.capitalString("example"));
    }

    @Test
    public void testCountVowels() {
       // Your code here
       assertEquals(3,stringManipulator.countVowels("Example"));
    }

    @Test
    public void testCountWords() {
       // Your code here
       assertEquals(4,stringManipulator.countWords("Hello, how are you? "));
    }

    @Test
    public void testFindSubstringIndex() {
       // Your code here
       assertEquals(5,stringManipulator.findSubstringIndex("Java programming","programming"));
    }

    @Test(timeout = 1000)
    public void testReverseWords() {
       assertEquals("World Hello", stringManipulator.reverseWords("Hello World"));
    }    
}
