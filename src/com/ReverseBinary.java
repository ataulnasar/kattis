package com;

import java.util.Scanner;
/*
 * Author Ata-ul-Nasar
 * Problem ID: reversebinary
 * Date 1 August 2016
 * */

public class ReverseBinary {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		if(input.matches("\\d+")){
			System.out.println(reversebinary(Integer.parseInt(input)));
		}
		else {
			System.out.println(input+" is not a valid number please try again with a valid integer value");
		}
		scan.close();
	}

	/*
	 * This function will reverse the binary number
	 * @param  number is any positive integer.
	 * @return  This function will return the decimal number.
	 * */
	private static int reversebinary(int number){
		String num = Integer.toBinaryString(number);
		String strTemp = "";
		for(int i=num.length()-1; i>=0; i--){
			strTemp+=num.charAt(i);
		}
		int decNum = Integer.parseInt(strTemp,2);
		
		return decNum;
	}
}
