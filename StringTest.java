package org.apex.assignment;

public class StringTest {

	public static void main(String[] args) {
		StringCheck sc = new StringCheck();
		String str = "13rt";
		
		if(sc.isInteger(str)) {
			System.out.println("str is integer");
		}else {
			System.out.println("str is not integer");
		}
		
		if(sc.isOddNumber(str)) {
			System.out.println("str is odd number");
		}else {
			System.out.println("str is not odd number");
		}
		
		if(sc.isEvenNumber(str)) {
			System.out.println("str is even number");
		}else {
			System.out.println("str is not even number");
		}
		
		if(sc.isPrimeNumber(str)) {
			System.out.println("str is prime number");
		}else {
			System.out.println("str is not prime number");
		}

	}

}
