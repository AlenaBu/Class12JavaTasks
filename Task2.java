package com.syntax.class12;

public class Task2 {

	public static void main(String[] args) {
		
		int evenSum=0;
		int oddSum=0;
		
		int [][] array= {{1,2,3,4,5},
				
		         {10,20,30,40,50}};



for (int row=0; row<array.length; row++ ) {
	
   for (int col=0; col<array[row].length; col++) {
   	if(array[row][col]%2==0) {
   		evenSum=evenSum+array[row][col];
   	}else {
   		oddSum=oddSum+array[row][col];
   	}
   }


	}
System.out.println("Even numbers sum "+evenSum);
System.out.println("Odd number sum "+oddSum);
	}

}