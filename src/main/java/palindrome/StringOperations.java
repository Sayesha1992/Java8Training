package palindrome;

public class StringOperations {

	
	public boolean verifyPalindrome(String inputString) {
	
		ChecksPalindrome checksPalindrome = (String str) -> {
			
			String reversedString = "";
			
			for(int i=str.length()-1; i>=0;i--) {
				reversedString = reversedString+str.charAt(i);
			} 
			
			if(str.equals(reversedString))
				return true;
			return false;
		};
	
		
		return checksPalindrome.checkIfPalindrome(inputString); 
		
	}
	
	
	public boolean verifyStringsAreRotatable(String firstString, String secondString) {
		
		ChecksRotatableStrings checksRotatableStrings = (String str1, String str2) -> {
			
			if(str1.length() != str2.length())
				return false;
			String str3 = str1+str1;
			if(str3.contains(str2))
				return true;
			else
				return false;	
		};
		
		return checksRotatableStrings.areStringsRotatable(firstString, secondString);
		
	}
}
