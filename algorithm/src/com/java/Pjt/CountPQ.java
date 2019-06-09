package com.algorithm.java;

public class CountPQ {

	public static void main(String[] args) {

		String str = "ppOOqq";

		System.out.println(solution(str));


	}

	public static boolean solution(String str) {

		boolean check = false;

		int countP = 0;
		int countQ = 0;

		for(int i=0; i<str.length(); i++) {

			if(str.toLowerCase().charAt(i)=='p') {

				countP++;

			}else if(str.toLowerCase().charAt(i)=='q') {

				countQ++;
			}

		}

		if(countP == countQ) {

			check = true;
		}


		return check;
	}

}
