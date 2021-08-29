import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
public class StringCalculatorTest {
    
    StringCalculator sc;
    //In before TestCase create object of StringCalculator
    @Before
	public void classCreate(){
		sc = new StringCalculator();
	}
        
    //Test for empty string    
    @Test
    public void testAddEmpty() {
        Assert.assertEquals(0, sc.Add(""));
    }
    
    //Test for only one number
    @Test
    public void testAddOneNumber() {
        Assert.assertEquals(4, sc.Add("4"));
    }
    
    //Test for two numbers
    @Test
    public void testAddTwoNumber() {
        Assert.assertEquals(7, sc.Add("2,5"));
    }
    
    //Test for many numbers
    @Test
    public void testAddManyNumber(){
        Assert.assertEquals(550, sc.Add("10,20,30,40,50,60,70,80,90,100"));
        Assert.assertEquals(10, sc.Add("1,2,3,4"));
    }
    
}
