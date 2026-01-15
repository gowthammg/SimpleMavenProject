package gowtham.simplemaven;
import org.testng.*;
import org.testng.annotations.Test;
import org.testng.Assert;
class NGTest1{
	@Test
	public void testAdd(){	
    	new AppTest("TestAdd");
    	int result = App.add(5,4);
        Assert.assertEquals(result, 9);
    }
    @Test
    public void testSub()
    {
    	int result = App.sub(5,4);
    	Assert.assertEquals(result, 1);
    }
    @Test
    public void testMultiply()
    {
    	int result = App.multiply(5,4);
    	Assert.assertEquals(result, 20);
    }
    @Test
    public void testDivide()
    {
    	int result = App.divide(5,4);
    	Assert.assertEquals(result, 1);
    }
    @Test
    public void testFail1() {
    	System.out.println("testFail1 passing");
    	Assert.assertEquals(true, true);
    }
    @Test
    public void testFail2() {
    	System.out.println("testFail2 failing");
    	Assert.assertEquals(true, true);
    }
    @Test
    public void testFail3() {
    	System.out.println("testFail3 failing");
    	Assert.assertEquals(true, true);
    }
}