package in.co.Java8;

import java.util.Arrays;

public class ParallelSort {
	
	public static void main(String[] args) {
		int [] arr = {4,5,8,9,0,1,2,3,};
		int [] arr1 = {9,7,8,5,4,3,2,};
		
		Arrays.parallelSort(arr);
		Arrays.parallelSort(arr1);
		
		System.out.println(arr);
		System.out.println(arr1);
	}

}
