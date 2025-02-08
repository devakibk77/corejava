/**
 * 
 */
package com.dvk.algorithms;

import java.util.Arrays;
import java.util.List;

/**
 * @author User
 *
 */
public class QuickSortDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuickSortDemo obj = new QuickSortDemo();
		int[] arr = {10,80,30,90,40,50,70};
		System.out.println("Before Sort : ");
		for (int i : arr) {
			System.out.print(i+" , ");
		}
		int high = arr.length-1;
		obj.quickSort(arr,0,high);
		System.out.println("After Sort : "+arr.toString());
		for (int i : arr) {
			System.out.print(i+" , ");
		}
	}
	
	private void quickSort( int[] arr, int low,int high) {
		System.out.println(low+"low="+high);
		if(low<high) {
			
			int pi = partition(arr,low,high);
			//System.out.println("pivot="+pi+"   "+arr[pi]);
			quickSort(arr,low,pi-1);
			System.out.println("After PI *************************"+arr[pi]);
			quickSort(arr, pi+1,high);
		}
	}
	
	private int partition(int[] arr, int low, int high) {
		int i = low-1;
		int pivot = arr[high];
		for (int j= low; j<=(high-1) ; j++) {
			if(arr[j]< pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				//System.out.println("*****"+arr[i]+"  "+arr[j]+" "+pivot);
			}		
		}
		//swap(arr[i+1],arr[high]);
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high]= arr[i+1];
		//System.out.println("&&&&&&&"+arr[i+1]+"  "+arr[high]+" "+pivot);
		System.out.println(pivot+"in partition : "+arr.toString());
		for (int k : arr) {
			System.out.print(k+" , ");
		}
		return i+1;
	}
	
}
