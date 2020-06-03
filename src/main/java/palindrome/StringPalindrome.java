package palindrome;

public class StringPalindrome implements ChecksPalindrome {

	@Override
	public boolean checkIfPalindrome(String string) {
		String reversedString = "";
		
		for(int i=string.length()-1; i>=0;i--) {
			reversedString = reversedString+string.charAt(i);
		} 
		
		if(string.equals(reversedString))
			return true;
		return false;
	}
	
	

}
