
public class CharCounter {
	
	static final int ASCII_SIZE = 256;

	public static void main(String[] args) {
		String sample = "zzzbbbaacc";
		System.out.println("Max occuring character is " + getMaxOccuringChar(sample));
				
	}

	private static Character getMaxOccuringChar(String sample) {

	int[] count = new int[ASCII_SIZE];
	int len = sample.length();
	for(int i=0; i<len; i++) {
		count[sample.charAt(i)]++;
	}
	int max = -1;
	char result =' ';
	
	for(int i=0; i< len; i++) {
		if(max < count[sample.charAt(i)]) {
			max = count[sample.charAt(i)];
			result = sample.charAt(i);
		}
	}
	
	return result;
	}

}
