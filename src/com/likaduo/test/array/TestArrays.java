package com.likaduo.test.array;

import java.util.Arrays;

/**
 * @author CHL
 * 
 */
public class TestArrays {

	public static void main(String[] args) {
		String[] arr = {"ss","dd","cc","ff","vv"};
		Arrays.sort(arr);
	    for(int i = 0;i<arr.length;i++){
	    	System.out.println(arr[i]);
	    	
	    }
		
		int index = Arrays.binarySearch(arr, "ff");
		
		
		System.out.println(index);
		
	}
}
