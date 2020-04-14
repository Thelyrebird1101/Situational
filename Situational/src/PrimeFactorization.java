
public class PrimeFactorization {
	/*
	************* ALGORITHM  *********
	Step 1: Check for divisibility with 2(smallest prime number), and at each step divide the number by 2, run a loop till the number is no longer divisible by 2
	Step 2: Check for divisibility with prime numbers from 3 onwards till square root of the number( as if a number has prime factors they'll be smaller than, or equal to the square root of that number
	Step 3: Finally if a number is not divisible by 2 and by prime numbers smaller than its suqare root, then the number is prime in itself, hence print the number
	 *
	 */
	
	
	
	
	
	
	
	
	
	
	
	public static void printPrimeFactorization(int i ) {
		
		
		
		while (i%2==0) {
			System.out.print(2+" ");
			i/=2;
		}
		
		for(int j=3; j<= Math.sqrt(i); j+=2) {
			while(i%j==0) {
				System.out.print(j+" ");
				i/=j;
			}
		}
	
	if(i > 2) {
		System.out.print(i);
	}
	
}
	
   public static void main(String[] args) {
	 
	   int i = 17;
	   int j = 315;
	   int k = 220;
	   printPrimeFactorization(i);
	   System.out.println();
	   printPrimeFactorization(j);
	   System.out.println();
	   printPrimeFactorization(k);
	   System.out.println();
}
}
