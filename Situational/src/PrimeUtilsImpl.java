
public class PrimeUtilsImpl implements PrimeUtils {

	
	/*
	************* ALGORITHM  *********
	Step 1: Check for divisibility with 2(smallest prime number), and at each step divide the number by 2, run a loop till the number is no longer divisible by 2
	Step 2: Check for divisibility with prime numbers from 3 onwards till square root of the number( as if a number has prime factors they'll be smaller than, or equal to the square root of that number
	Step 3: Finally if a number is not divisible by 2 and by prime numbers smaller than its suqare root, then the number is prime in itself, hence print the number
	 *
	 */
	
	private int i;
	
	public PrimeUtilsImpl(int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
	}

	@Override
	public void printPrimeFactorization(int i) {
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
	
	/*
	 To check for prime, 
	 Assign a boolean isPrime = true, 
	 check for divisibility till square root of the number, 
	 if the number is divisible by any number from the range 2 to sqrt(N), 
	 assign boolean isPrime to false and break the loop, else continue. 
	 This solution is more efficient than checking till n/2 and works for 2 as well
	 
	 */
	
	@Override
	public boolean isPrime(int i) {
		boolean isPrime = true;
		int count = 0;
		for(int n=2; i<= Math.sqrt(i); n++) {
			
			if(i%n==0) {
			isPrime=false;
			break;
		}
	}
		return isPrime;
		
	}

	
	
	/*
	 use the isPrime function defined in previous question, 
	 keep calling isPrime with incremented n, till isPrime is returned true, wherein break the loop
	 return n which is prime
	 */
	
	@Override
	public int getNextPrime(int i) {
		// TODO Auto-generated method stub
		boolean prime = false;
		while(prime==false) {
		 prime=isPrime(++i);
		
	}
		return i;
		
		
	}
	

}
