package com.likaduo.test.calss;
/**
 * @author CHL
 * 
 */
public class TestTimr {
	public static void main(String[] args) {
		
		For f = new For();
		
		long start = System.currentTimeMillis();
		f.Test();
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
				
	}

}
