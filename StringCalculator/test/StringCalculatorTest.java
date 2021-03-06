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
    
    //Test for delimiter can be "\n or ,"
    @Test
    public void testAddNewLineDelimiter(){
        Assert.assertEquals(15,sc.Add("6\n5,4"));
        Assert.assertEquals(28,sc.Add("2\n5\n10,6,3\n2"));
        
    }
    
    //Test for different delimiters
    @Test 
    public void testAddDifferentDelimiter(){
        Assert.assertEquals(12,sc.Add("//\n\n1\n5\n6"));
        Assert.assertEquals(60,sc.Add("//;\n10;20;30"));
    }
    
    //Test for negative
    @Test(expected=IllegalArgumentException.class)
    public void testAddNoNegative(){
       sc.Add("3\n-5\n10,2,9\n2");
    }
    
    //Test for number bigger than 1000
    @Test
    public void testAddBiggerthan1000(){
        Assert.assertEquals(1001,sc.Add("1000,1,1001"));
    } 
    
    //Test for any length of delimiter
    @Test
    public void testAddAnyLengthDelimiter(){
         Assert.assertEquals(6,sc.Add("//[***]\n1***2***3"));
         Assert.assertEquals(10,sc.Add("//[;;]\n1;;4;;5"));
    }
    
    //Test for more different delimiter
    @Test
    public void testAddMoreDifferentDelimiter(){
        Assert.assertEquals(10,sc.Add("//[*][']\n1*2'3'4"));
        Assert.assertEquals(10,sc.Add("//[;][@]\n1;4@5"));
    }
    
    //Test for multiple delimiters with any length
    @Test
    public void testAddMultipleAnyLengthDelimiter(){
        Assert.assertEquals(10,sc.Add("//[***]['']\n1''2***3***4"));
        Assert.assertEquals(10,sc.Add("//[;][@@]\n1;4@@5"));
    }
}
