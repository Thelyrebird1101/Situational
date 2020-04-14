
public class Palindrome {
	static boolean isPalindrome(String str) {
		int firstChar = 0,
			lastChar = str.length()-1;
		boolean isPalindrome = true;
		while(firstChar<lastChar) {
		/*	if(!isLowerCase(str.charAt(firstChar))) {
				firstChar++;
				continue;
			}
			if(!isLowerCase(str.charAt(lastChar))) {
				lastChar--;
				continue;
			}
			*/
			if(!(str.charAt(firstChar)==str.charAt(lastChar))) {
				return false;
			}
			firstChar++;
			lastChar--;
				
		}
		
		
		return isPalindrome;
		
	}
	
	
	
	private static boolean isLowerCase(char c) {
		int value = (int) c;
		if(value>=97 && value <=122)
			return true;
		
		return false;
	}



	public static void main(String[] args) {
		String string = "mal aya lam";
		System.out.println(isPalindrome(string));
		
	}

}
;