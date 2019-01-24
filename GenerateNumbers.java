package org.apex.assignment;

public class GenerateNumbers {
	
	
	public void genNumbers() {
		int counter = 0;
		for(int i = 1; i <=1000; i++) {
			System.out.print(i+" ");
			counter++;
			if(counter % 20 == 0) {
				System.out.println();
			}
		}
	}
	
	public void genNumbersMultiple() {
		int counter = 0;
		for(int i = 1; i <=1000; i++) {
			if( i%5 == 0)System.out.print(i+" ");
			counter++;
			if(counter % 50 == 0) {
				System.out.println();
			}
		}
	}
	
	public void genNumbersOdd() {
		int counter = 0;
		for(int i = 1; i <=1000; i+=2) {
			System.out.print(i+" ");
			counter++;
			if(counter % 20 == 0) {
				System.out.println();
			}
		}
	}
	
	
}
