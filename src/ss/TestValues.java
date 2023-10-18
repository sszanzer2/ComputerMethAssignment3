package ss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestValues {

	@Test
	//tests to make sure it returns the correct sum with positive values
	public void TestSumCorrectPositiveNums() {
		int[] arr = {10,20,30,40,50};
		assertEquals(150, Values.getSum(arr));
		
	}
	
	@Test
	//tests to make sure it returns the correct sum with negative values
	public void TestSumCorrectNegativeNums() {
		int[] arr = {-10,-25,-3,-15,-30};
		assertEquals(-83, Values.getSum(arr));
		
	}
	
	@Test
	//Testing to make sure it returns the correct sum when the array contains positive and negative values
	public void TestCorrectSumWithPosAndNegValues() {
		int [] arr = {-10, 45, -3, 25, -50};
		assertEquals(7, Values.getSum(arr));
	}
	
	@Test 
	//Testing to make sure it returns the correct max num of the array
	public void TestReturnsCorrectMaxWithPosValues() {
		int[] arr = {25,3,47,98,10};
		assertEquals(98, Values.getMax(arr));
	}
	
	
	@Test 
	//Testing to make sure it returns the correct max num of the array
	public void TestReturnsCorrectMaxWithNegValues() {
		int[] arr = {-25,- 3 ,-47, -98, -10};
		assertEquals(-3, Values.getMax(arr));
	}
	
	@Test 
	//Testing an empty array
	public void TestReturnsCorrectMaxWithEmptyArray() {
		int[] arr = {};
		assertEquals(Integer.MIN_VALUE, Values.getMax(arr));
	}
	
	@Test
	//Testing to make sure it returns the correct min num from the array
	public void TestReturnsCorrectMinWithPosValues() {
		int[]arr = {2,4,6,3,1,8,9};
		assertEquals(1, Values.getMin(arr));
	}
	
	@Test
	//Testing to make sure it returns the correct min num from the array
	public void TestReturnsCorrectMinWithNegValues() {
		int[]arr = {-2,-4,-6,-3,-1,-8,-9};
		assertEquals(-9, Values.getMin(arr));
	}
	
	@Test
	//Testing an empty array
	public void TestReturnsCorrectMinWithEmptyArray() {
		int[]arr = {};
		assertEquals(Integer.MAX_VALUE, Values.getMin(arr));
	}
	
	@Test
	//Testing to make sure it returns the correct range
	public void TestReturnsCorrectRangeWithPositiveValues() {
		int[] arr = {5,3,6,8,7};
		assertEquals(6, Values.getRange(arr));
	}
	
	@Test
	//Testing it works when the array contains duplicate values
	public void TestGetRangeWithDuplicates() {
		int[] arr = {1,2,2,4,5,1};
		assertEquals(5, Values.getRange(arr)); // right range num?
	}
	
	@Test
	//testing if getRange works when there are negative numbers in the array
	public void TestGetRangeWithNegativeValue() {
		int[] arr = {-1,5,7,3,-4};
		assertEquals(12, Values.getRange(arr));
	}
	
	

}
