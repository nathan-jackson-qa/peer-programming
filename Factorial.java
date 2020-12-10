
public class Factorial {
  
    public Factorial()
    {

    }

    public static String checkFactorial(int check)
    {
        int divider = 1;
        int counter=0;
        int iterateValue = check;
        while(iterateValue > 1)
        {
        	if(iterateValue % divider == 0)
        	{
        		iterateValue = iterateValue/divider;
        		divider++;
        		counter++;
        	}
        	else {
        		return "None";
        	}
        }
        
        String output = counter + "!";
        return output;
    }
}