import java.util.*;
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
        List<Integer> negative=new ArrayList<>();
        int sum=0;
        int temp=0;
        boolean neg=false;
        for(int i=0;i<numbersArray.length;i++)
        {
            temp=Integer.parseInt(numbersArray[i]);
            if(temp<0)
            {
                neg=true;
                negative.add(temp);
            }
            else if(temp>1000)
                continue;
            else
                sum=sum+temp;
        }
        if(neg)
        {
            String msg="negatives not allowed: "+negative;
            throw new IllegalArgumentException(msg); 
        } 
        return sum;
    }
}