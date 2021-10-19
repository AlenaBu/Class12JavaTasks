package com.syntax.class12;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write a program to check whether is a prime number or not
		
		int number=15;
		boolean isPrime=true;
		//change
		if (number>1) {
			for (int i=2; i<number; i++) {
				if(number%i==0) {
					isPrime=false;
					break;
				}
			}
		}else {
			isPrime=false;
		}
		System.out.println(number+" is prime "+isPrime);
	}

}
