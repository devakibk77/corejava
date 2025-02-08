package com.dvk.algorithms;

import java.util.Arrays;

public class TestDemo1 {

	public static void main(String[] args) {
		String str ="My name is krishna rao";
		 char[] carr= str.toLowerCase().replace(" ", "").toCharArray();
		 Arrays.sort(carr);
		 System.out.println(carr);
		 int count=0;char prev=' ',next=' ',temp=' ';
		 for(char c : carr) {
			 next =c;
			 if (next==prev) {
				 count++;
			 }else {
				 if (count>0) {
				 System.out.println(c+"   "+count);
				 count=0;
				 }
				 else continue;
			 }
			 prev=next;
		 }

	}

}
