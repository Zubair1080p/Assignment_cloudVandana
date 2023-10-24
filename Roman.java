
import java.util.HashMap;

public class Roman {
	
	public static void main (String[] args)
	{
		String roman = "X";
		int result = roman(roman);
		System.out.println(result);
	}

	public static int roman(String s)
	{
		
		HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;
        
        for(int i = s.length() - 1; i >=0; i--)
        {
        	char currentChar = s.charAt(i);
        	int currentValue = romanValues.get(currentChar);
        	
        	if(currentValue < prevValue)
        	{
        		result -= currentValue;
        	}
        	
        	else
        	{
        		result += currentValue;
        	}
        	
        	prevValue = currentValue;
        }
        return result;

	}
}
