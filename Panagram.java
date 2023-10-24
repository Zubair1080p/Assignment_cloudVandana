

public class Panagram {
	
	public static void main(String[] args)
	{
		String sentence = "This is my country";
		boolean isPanagram = isPanagram(sentence);
		if(isPanagram)
		{
			System.out.println("The sentence is Panagram");
		}
		else
		{
			System.out.println("The sentence is not a Panagram");
		}
	}
	public static boolean isPanagram(String sentence)
	{
		boolean[] letterPresent = new boolean[26];
		
		sentence = sentence.toLowerCase();
		for(int i = 0;i<sentence.length();i++)
		{
		char ch = sentence.charAt(i);
		if(ch >= 'a' && ch <= 'z')
		{
			letterPresent[ch - 'a'] = true;
		}
		}
		for(boolean isPresent : letterPresent)
		{
			if(!isPresent)
				return false;
		}
		
	return true;
}
}
