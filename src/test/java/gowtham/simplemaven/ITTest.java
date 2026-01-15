package gowtham.simplemaven;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class ITTest extends TestCase{	
	    /**
	     * Create the test case
	     *
	     * @param testName name of the test case
	     */
	    public ITTest(String testName )
	    {
	        super(testName);
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

}
