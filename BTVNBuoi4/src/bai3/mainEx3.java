package bai3;

import java.util.Scanner;

public class mainEx3 {
	
	public static void main(String[] args) {
		IsPrime A = new IsPrime();
		System.out.println(A.isPrime(7));
		System.out.println(A.isPrime(122000));
		System.out.println(A.isPrime(5.2));
		System.out.println(A.isPrime(5.88));
	}

}
