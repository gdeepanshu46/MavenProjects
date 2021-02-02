package com.training.cerner.codecamp1;

import java.util.*;

public class SubsetSum{

	/**
	 * isPair() function to find if there is a pair sum equal to required sum
	 * if a required pair exists in the array
	 * Time complexity of this solution is O(n * log n) for sorting the array
	 * @param an array
	 * @param size of array
	 * @param required sum
	 * @return -1
	 * @return 1
	 */
	
	public int isPair(int arr[], int sum){
		
		//if array contains 0 or 1 element only
		if(arr == null) {
			throw new NullPointerException("Array is null");
		}
		
		int n = arr.length;
		if( n == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		else if(n == 1) {
			throw new IllegalArgumentException("No pair exists in array");
		}
		
		//sorting the array
		Arrays.sort(arr);

		//initializing left and right pointers as i and j
		int i = 0, j = n - 1;

		//flag variable
		int f = 0;

		/*
		 * keep on reducing the array from left and right until the required sum is
		 * reached
		 */
		while(i < j){

			//if given pair sum is matched, print results
			if(arr[i] + arr[j] == sum){
				System.out.println(1);
				System.out.println(arr[i] + " " + arr[j]);
				return 1;
			}

			/*
			 * if sum of given pair is less than required sum, increment left pointer
			 */
			else if(arr[i] + arr[j] < sum){
				i++;
			}
			
			/*
			 * if sum of given pair is more than required sum, decrement right pointer
			 */
			else{
				j--;
			}

		}

		//if flag remains same, return no result found
		return -1;
		
	}
	
	/**
	 * isTriplet() function to find if there is a triplet sum equal to required sum
	 * if a required pair exists in the array
	 * Time complexity of this solution is O(n ^ 2) for sorting the array
	 * @param an array
	 * @param size of array
	 * @param required sum
	 * @return -1
	 * @return 1
	 */
	public int isTriplet(int arr[], int sum){
		
		//if array contains 0 or 1 element only
		if(arr == null) {
			throw new NullPointerException("Array is null");
		}
		
		int n = arr.length;
		if( n == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		else if(n == 1) {
			throw new IllegalArgumentException("No pair exists in array");
		}

		//sorting the array
		Arrays.sort(arr);
		
		//flag variable
		int f = 0;

		//traverse for each and every index
		for(int k=0; k<= n-3; k++){

			//set left and right pointers as i and j
			int i = k+1, j = n - 1;
			
			/*
			 * keep on reducing the array from left and right until the required sum is
			 * reached
			 */
			while(i < j){

				/*
				 * if the sum of given pair and current element sums up to required sum, print
				 * result
				 */
				if(arr[k] + arr[i] + arr[j] == sum){
					System.out.println(1);
					System.out.println(arr[k] + " " + arr[i] + " " + arr[j]);
					return 1;
				}

				/*
				 * if the sum of given pair and current element is less than required sum,
				 * increment left pointer
				 */
				else if(arr[k] + arr[i] + arr[j] < sum){
					i++;
				}

				/*
				 * if the sum of given pair and current element is more than required sum,
				 * decrement right pointer
				 */
				else{
					j--;
				}

			}
		}

		//if flag remains same, return no result found
		return -1;
	
	}

	/**
	 * isQuadruplet() function to find if there is a quadruplet sum equal to required sum
	 * if a required pair exists in the array
	 * Time complexity of this solution is O(n ^ 3) for sorting the array
	 * @param an array
	 * @param size of array
	 * @param required sum
	 * @return -1
	 * @return 1
	 */
	public int isQuadruplet(int arr[], int sum){
		
		//if array contains 0 or 1 element only
		if(arr == null) {
			throw new NullPointerException("Array is null");
		}
		
		int n = arr.length;
		if( n == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		else if(n == 1) {
			throw new IllegalArgumentException("No pair exists in array");
		}

		/* sorting the array */
		Arrays.sort(arr);
		
		int f = 0;

		/* traverse for each and every index */
		for(int l=0; l<= n-4; l++){

			/* traverse for each and every index */
			for(int k=l+1; k<=n-3; k++){

				/* set left and right pointers as i and j */
				int i = k+1, j = n - 1;
				
				/*
				 * keep on reducing the array from left and right until the required sum is
				 * reached
				 */
				while(i < j){

					/*
					 * if the sum of given quadruplet matches the required sum, print result
					 */
					if(arr[l] + arr[k] + arr[i] + arr[j] == sum){
						System.out.println(1);
						System.out.println(arr[l] + " " + arr[k] + " " + arr[i] + " " + arr[j]);
						return 1;
					}

					/*
					 * if the sum of given quadruplet is less than required sum, increment left
					 * pointer
					 */
					else if(arr[l] + arr[k] + arr[i] + arr[j] < sum){
						i++;
					}

					/*
					 * if the sum of given quadruplet is more than required sum, decrement right
					 * pointer
					 */
					else{
						j--;
					}

				}
			}
		}

		/* if flag remains same, return no result found */
		return -1;
	
	}

}
