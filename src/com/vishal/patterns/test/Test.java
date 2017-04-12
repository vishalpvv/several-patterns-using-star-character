package com.vishal.patterns.test;

import java.util.Scanner;

import com.vishal.patterns.Patterns;

class Test {
	
	private static Scanner s;

	public static void main(String[] args) {

		while (true) {
			s = new Scanner(System.in);
			System.out.println("\nEnter an integer value for the pattern(1 - 15): ");
			int patternNum = s.nextInt();
			System.out.println("Enter an integer value for the size of pattern: ");
			int patternSize = Math.abs(s.nextInt());
			Patterns.selectPattern(patternNum, patternSize);
			
		}
	}
}

/*
 *
 ***
 *****
 *******
 *********
 ***********
 *************
 ***************
 *****************
 * * * * *** * *** * *** * *** * *** *
 ***************
 * ---------------------- 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5 1 2 3 4 5 6 1 2 3 4 5 6
 * 7 ---------------------- 1 2 3 4 5 6 7 1 2 3 4 5 6 1 2 3 4 5 1 2 3 4 1 2 3 1
 * 2 1 ---------------------- 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5 1 2 3 4 5 6 1 2 3 4
 * 5 6 7 1 2 3 4 5 6 1 2 3 4 5 1 2 3 4 1 2 3 1 2 1
 * 
 * ---------------------- 1 10 101 1010 10101 101010 1010101
 * ---------------------- 1010101 0101010 1010101 0101010 1010101 0101010
 * 1010101 ---------------------- 7 6 5 4 3 2 1 7 6 5 4 3 2 7 6 5 4 3 7 6 5 4 7
 * 6 5 7 6 7 ---------------------- 7 7 6 7 6 5 7 6 5 4 7 6 5 4 3 7 6 5 4 3 2 7
 * 6 5 4 3 2 1 ---------------------- 1 2 3 4 5 6 7 1 2 3 4 5 6 1 2 3 4 5 1 2 3
 * 4 1 2 3 1 2 1 1 2 1 2 3 1 2 3 4 1 2 3 4 5 1 2 3 4 5 6 1 2 3 4 5 6 7
 * ---------------------- 1234567 234567 34567 4567 567 67 7 67 567 4567 34567
 * 234567 1234567 ---------------------- 1111111 1111122 1111333 1114444 1155555
 * 1666666 7777777 ---------------------- 1 1 2 1 1 2 3 2 1 1 2 3 4 3 2 1 1 2 3
 * 4 5 4 3 2 1 1 2 3 4 5 6 5 4 3 2 1 1 2 3 4 5 6 7 6 5 4 3 2 1
 * ---------------------- 0000000 0100000 0020000 0003000 0000400 0000050
 * 0000006 ---------------------- 1 2 6 3 7 10 4 8 11 13 5 9 12 14 15
 * ---------------------- 1 2 3 4 5 6 7 2 3 4 5 6 7 3 4 5 6 7 4 5 6 7 5 6 7 6 7
 * 7 6 7 5 6 7 4 5 6 7 3 4 5 6 7 2 3 4 5 6 7 1 2 3 4 5 6 7
 * ----------------------
 */