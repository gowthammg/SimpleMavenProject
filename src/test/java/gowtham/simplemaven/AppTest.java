package gowtham.simplemaven;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import gowtham.simplemaven.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testAdd()
    {	
    	new AppTest("TestAdd");
    	int result = App.add(5,4);
        assertEquals(result, 9);
    }
    
    public void testSub()
    {
    	int result = App.sub(5,4);
        assertEquals(result, 1);
    }
    
    public void testMultiply()
    {
    	int result = App.multiply(5,4);
        assertEquals(result, 20);
    }
    
    public void testDivide()
    {
    	int result = App.divide(5,4);
        assertEquals(result, 1);
    }
    
    public void testFail1() {
    	System.out.println("testFail1 failing");
    	assertEquals(true, true);
    }
    
    public void testFail2() {
    	System.out.println("testFail2 failing");
    	assertEquals(false, true);
    }
    
    public void testFail3() {
    	System.out.println("testFail3 failing");
    	assertEquals(false, true);
    }
}
