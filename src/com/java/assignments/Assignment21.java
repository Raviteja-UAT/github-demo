package com.java.assignments;

public class Assignment21 {

	public static void main(String[] args) {
		// java program to remove duplicates in a string

		String str = "excelr session";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean isDuplicate = false;
			for (int j = 0; j < result.length(); j++) {
				if (ch == result.charAt(j)) {
					isDuplicate = true;
					break;
				}
			}

			if (!isDuplicate) {
				result += ch;
			}

		}

		System.out.println(result);

	}

}
//find max and min number from the given array