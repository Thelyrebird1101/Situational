import java.util.*;
import java.util.stream.Collectors;

public class MyStringUtils {

	public static List<String> convertFirstCharacterToUpper(List<String> inStream){
	List<String> upperCased = inStream.stream().
			map(t->t.substring(0,1).toUpperCase() + t.substring(1)).
			collect(Collectors.toList());
		
	
	for(String s: upperCased) {
		System.out.println(s);
	}
	return upperCased;
	}
	public static void main(String[] args) {
		List<String> lowerCase = new ArrayList<>();
		lowerCase.add("apple");
		lowerCase.add("ball");
		lowerCase.add("cat");
		System.out.println("hi");
		 convertFirstCharacterToUpper(lowerCase);
		
	}

}
