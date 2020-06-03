package palindrome;

public class StringRotation implements ChecksRotatableStrings {

	@Override
	public boolean areStringsRotatable(String str1, String str2) {
		
		if(str1.length() != str2.length())
			return false;
		String str3 = str1+str1;
		if(str3.contains(str2))
			return true;
		else
			return false;
	}
	
	

}
