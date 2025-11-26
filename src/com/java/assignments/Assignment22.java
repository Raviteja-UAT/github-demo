package com.java.assignments;

public class Assignment22 {

	public static void main(String[] args) {
		// java program to find min and max element in an array

		int[] arr = { 2, 4, 6, 1, 3, 5 };

		int max = arr[0];//2
		int min = arr[0];//2

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];//4,6
			if (min > arr[i])
				min = arr[i];
		}

		System.out.println("minimum element of array : " + min);
		System.out.println("maximum element of array : " + max);

	}

}


