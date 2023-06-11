package bai3;

public class IsPrime {
	public boolean isPrime(int n) {
		if(n < 2)
			return false;
		for(int i = 2; i < n; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
	public boolean isPrime(long n) {
		if(n < 2)
			return false;
		for(int i = 2; i < n; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
	public boolean isPrime(double n) {
		return false;
	}
	public boolean isPrime(float n) {
		return false;
	}

}
