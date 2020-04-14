import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeUtilsImplTest {

	@Test
	void testPrintPrimeFactorization() {
		int i = 225;
		PrimeUtils p = new PrimeUtilsImpl(i);
		p.printPrimeFactorization(i);
	}

	@Test
	void testIsPrime() {
		int i = 225;
		PrimeUtils p = new PrimeUtilsImpl(i);
		p.isPrime(i);
		
	}

	@Test
	void testGetNextPrime() {
		int i= 225;
		PrimeUtils p = new PrimeUtilsImpl(i);
		p.getNextPrime(i);
	}

}
