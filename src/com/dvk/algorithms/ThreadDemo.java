/**
 * 
 */
package com.dvk.algorithms;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

/**
 * @author DELL
 *
 */
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intarray = new int[] {1,2,3,4,5,6,7};
		List<Integer> intlist= new ArrayList<Integer>();
		intlist.add(1);intlist.add(2);
		intlist.forEach(i -> System.out.println(i));
		for(int i : intlist ) {
			System.out.println(i);
		}
		Stream.of("India","australia","us","","england","uk","london","italy")
		//.dropWhile(s -> !s.isEmpty())
		.takeWhile( s -> !s.isEmpty())
		.forEach(System.out::print);
		
	}
}
