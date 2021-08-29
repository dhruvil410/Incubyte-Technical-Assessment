public class StringCalculator {
    //Method to add two numbers
    public int Add(String numbers)
    {
        if(numbers.equals(""))
            return 0;
        StringBuilder delimiter=new StringBuilder("");
        StringBuffer sb=new StringBuffer(numbers);
        if(numbers.startsWith("//"))
        {
            delimiter.append("[");
            sb.delete(0,2);
            delimiter.append(sb.charAt(0));
            numbers=sb.substring(2);
            delimiter.append("]");
        }
        else
            delimiter.append("[,\n]");
        String numbersArray[]=numbers.split(new String(delimiter));
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