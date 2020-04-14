/*
 To check for prime, 
 Assign a boolean isPrime = true, 
 check for divisibility till square root of the number, 
 if the number is divisible by any number from the range 2 to sqrt(N), 
 assign boolean isPrime to false and break the loop, else continue. 
 This solution is more efficient than checking till n/2 and works for 2 as well
 
 */




public class isPrime {

	
	public static boolean isPrime(int n) {
		
		boolean isPrime = true;
		int count = 0;
		for(int i=2; i<= Math.sqrt(n); i++) {
			count =0;
			if(n%i==0) {
			isPrime=false;
			break;
		}
	}
		return isPrime;
}
	
	public static void main(String[] args) {
		System.out.println( isPrime(9));
		System.out.println(isPrime(49));
		System.out.println(isPrime(4));
		System.out.println(isPrime(3));
		System.out.println(isPrime(225));
	}
}