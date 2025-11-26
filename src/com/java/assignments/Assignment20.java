package com.java.assignments;

public class Assignment20 {

	public static void main(String[] args) {
		// sort an array in ascending order
		
		int[] arr = {5,1,4,2,3};
		int temp = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
