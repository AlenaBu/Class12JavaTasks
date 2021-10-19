package com.syntax.class12;

public class ReviewHW {

	public static void main(String[] args) {
		// 1 create a 2d array of integers. print the sum
		
		int [][] array= {{1,2,3,4,5},
				
				         {10,20,30,40,50}};
		
		System.out.println("Number of rows in above 2D array "+array.length);
		int sum=0;
		for (int row=0; row<array.length; row++ ) {
			System.out.println("Mumber of columns in the "+row+" row "+array[row].length);
		    for (int col=0; col<array[row].length; col++) {
		    	System.out.println(array[row][col]);
		    	sum =sum +array[row][col];
		    }
		 

	}
		   System.out.println("Sum "+sum);
}
}