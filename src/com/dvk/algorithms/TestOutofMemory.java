/**
 * 
 */
package com.dvk.algorithms;

/**
 * @author DELL
 *
 */
public class TestOutofMemory {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		System.out.println("welcome");
		System.out.println("max memory size:"+Runtime.getRuntime().maxMemory()+"free memory:"+Runtime.getRuntime().freeMemory());
		System.out.println("Total Memory:"+Runtime.getRuntime().totalMemory());		try {
			
			System.out.println("in try");
			Thread t1 = new Thread(
									() ->{
										int count=0;
										while(count<10) {
											Runtime.getRuntime().runFinalization();
											Runtime.getRuntime().gc();
											
											try {
												System.out.println("in thread");
											Thread.sleep(1000);
											}catch(InterruptedException ex) {
												System.out.println("error:"+ex.getMessage());
											}
											count++;
										}
										
									}
									);
			Thread t2 = new Thread(()->{
				Integer[] myarray = new Integer[1000*1000*1000];
				myarray[0]=7;
				System.out.println("Array initialized :"+myarray[0]);
			});
			t2.start();
			t1.start();
			
		}catch(OutOfMemoryError err) {
			System.out.println("error");
			
		}
		
		

	}

}
