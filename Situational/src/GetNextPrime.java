/*
 use the isPrime function defined in previous question, 
 keep calling isPrime with incremented n, till isPrime is returned true, wherein break the loop
 return n which is prime
 */




public class GetNextPrime {
	
	public static int getNextPrime(int n) {
		
		boolean prime = false;
		while(prime==false) {
		 prime=isPrime(++n);
		
	}
		return n;
}
	
public static boolean isPrime(int n) {
	boolean isPrime = true;
	for(int i=2; i<= Math.sqrt(n); i++) {
		if(n%i==0) {
		isPrime=false;
		break;
	}
}
	return isPrime;
}
public static void main(String[] args) {
	System.out.println(getNextPrime(4));
}
}
