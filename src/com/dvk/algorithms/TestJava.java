/**
 * 
 */
package com.dvk.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author User
 *
 */
public class TestJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = testTry(5);
		System.out.println("@@@@@@@@"+k);
		testHashmap();
	}

	static int testTry(int i) {
		try {
			System.out.println("in Try");
			return i;
		}catch(Exception e) {
			
		}finally {
			System.out.println("in finally");
			return 10;
		}		
	}
	
	static void testHashmap() {
		int [] arr =  {1,2,3};
		//using hash map to find value from array
		Map<String,Integer> intmap = new HashMap<>();
		intmap.put("one", 1);intmap.put("two",2);intmap.put("three", 3);
		int target =5;
		for ( int t : arr) {
			if(intmap.containsValue((target-t))) {
				System.out.println("##############"+t);
			}
		}
	}
}
