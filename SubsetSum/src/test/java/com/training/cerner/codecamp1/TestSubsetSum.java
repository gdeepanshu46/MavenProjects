package com.training.cerner.codecamp1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestSubsetSum {
	
	SubsetSum obj;
	@BeforeEach
	void setUp() {
		obj = new SubsetSum();
	}
	
	@Test
	//happyFlowTestForPair
	public void pairFound() {
		int arr[] = new int[] {1, 2, 3, 4, 5};
		assertEquals(1, obj.isPair(arr, 9));
	}
	
	@Test
	//happyFlowTestForPair
	public void pairNotFoundLeft() {
		int arr[] = new int[] {1, 2, 3, 4, 5};
		assertEquals(-1, obj.isPair(arr, 19));
	}
	
	@Test
	//happyFlowTestForPair
	public void pairFoundMiddle() {
		int arr[] = new int[] {1, 2, 3, 4, 5};
		assertEquals(1, obj.isPair(arr, 3));
	}
	
	@Test
	//happyFlowTestForPair
	public void pairFoundRight() {
		int arr[] = new int[] {1, 2, 3, 4, 5};
		assertEquals(1, obj.isPair(arr, 7));
	}
	
	@Test
	//happyFlowTestForTriplet
	public void tripletFoundLeft() {
		int arr[] = new int[] {1, 2, 3, 4, 5};
		assertEquals(1, obj.isTriplet(arr, 6));
	}
	
	@Test
	//happyFlowTestForTriplet
	public void tripletFoundRight() {
		int arr[] = new int[] {1, 2, 3, 4, 5};
		assertEquals(1, obj.isTriplet(arr, 6));
	}
	
	@Test
	//happyFlowTestForTriplet
	public void tripletFoundMid() {
		int arr[] = new int[] {1, 2, 3, 4, 5};
		assertEquals(1, obj.isTriplet(arr, 9));
	}
	
	@Test
	//happyFlowTestForTriplet
	public void tripletNotFound() {
		int arr[] = new int[] {1, 2, 3, 4, 5};
		assertEquals(-1, obj.isTriplet(arr, 19));
	}
	
	
	
	@Test
	//happyFlowTestForQuadruplet
	public void quadrupletFoundleft() {
		int arr[] = new int[] {1, 2, 3, 4, 5};
		assertEquals(1, obj.isQuadruplet(arr, 10));
	}
	
	@Test
	//happyFlowTestForQuadruplet
	public void quadrupletFoundRight() {
		int arr[] = new int[] {1, 2, 3, 4, 5};
		assertEquals(1, obj.isQuadruplet(arr, 14));
	}
	
	@Test
	//happyFlowTestForQuadruplet
	public void quadrupletFoundMid() {
		int arr[] = new int[] {1, 2, 3, 4, 5, 6};
		assertEquals(1, obj.isQuadruplet(arr, 14));
	}
	
	@Test
	//happyFlowTestForQuadruplet
	public void quadrupletNotFound() {
		int arr[] = new int[] {1, 2, 3, 4, 5};
		assertEquals(-1, obj.isQuadruplet(arr, 20));
	}
	
	/* When List of Items is null */
	
	@Test
	void nullArrayTest() {
		
		int arr[] = null;
		NullPointerException excp = assertThrows(NullPointerException.class, () -> obj.isPair(arr, 9));
		assertEquals("Array is null", excp.getMessage());
		
	}
	
	/* When List of Items is Empty */
	
	@Test
	void EmptyArrayTest() {
		
		int arr[] = new int[0];
		IllegalArgumentException excp = assertThrows(IllegalArgumentException.class, () -> obj.isPair(arr, 9));
		assertEquals("Array is empty", excp.getMessage());
		
	}
	
	/* When no pair exists in the array */
	@Test
	void singleElementArrayTest() {
		
		int arr[] = new int[] {1};
		IllegalArgumentException excp = assertThrows(IllegalArgumentException.class, () ->  obj.isPair(arr, 9));
		assertEquals("No pair exists in array", excp.getMessage());
		
	}


}

