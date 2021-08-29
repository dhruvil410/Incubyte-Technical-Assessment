public class StringCalculator {
    //Method to add two numbers
    public int Add(String numbers)
    {
        if(numbers.equals(""))
            return 0;
        String numbersArray[]=numbers.split("[,\n]");
        if(numbersArray.length==1)
            return Integer.parseInt(numbersArray[0]);
        int sum=0;
        for(int i=0;i<numbersArray.length;i++)
        {
            sum=sum+Integer.parseInt(numbersArray[i]);
        }
        return sum;
    }
}