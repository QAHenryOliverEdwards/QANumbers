package com.qa.main;

import java.lang.Integer;

public class Numbers {
	
	String one = "one";
	String two = "two";
	String three = "three";
	String four = "four";
	String five = "five";
	String six = "six";
	String seven = "seven";
	String eight = "eight";
	String nine = "nine";
	String ten = "ten";
	String eleven = "eleven";
	String twelve = "twelve";
	String thirteen = "thirteen";
	String fourteen = "fourteen";
	String fifteen = "fifteen";
	String sixteen = "sixteen";
	String seventeen = "seventeen";
	String eighteen = "eighteen";
	String nineteen = "nineteen";
	String twenty = "twenty";
	String thirty = "thirty";
	String fourty = "fourty";
	String fifty = "fifty";
	String sixty = "sixty";
	String seventy = "seventy";
	String eighty = "eighty";
	String ninty = "ninety";
	
	
	public int adder(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public String numbertoString(int num1, int num2) {
		int result = adder(num1, num2);
		String resultStr = "";
		resultStr = Integer.toString(result);
		
		String returnStr = "";
		
		if (result < 20) {
			if (result == 1) {
				returnStr = one;
			}
			else if (result == 2) {
				returnStr = two;
			}
			else if (result == 3) {
				returnStr = three;
			}
			else if (result == 4) {
				returnStr = four;
			}
			else if (result == 5) {
				returnStr = five;
			}
			else if (result == 6) {
				returnStr = six;
			}
			else if (result == 7) {
				returnStr = seven;
			}
			else if (result == 8) {
				returnStr = eight;
			}
			else if (result == 9) {
				returnStr = nine;
			}
			else if (result == 10) {
				returnStr = ten;
			}
			else if (result == 11) {
				returnStr = eleven;
			}
			else if (result == 12) {
				returnStr = twelve;
			}
			else if (result == 13) {
				returnStr = thirteen;
			}
			else if (result == 14) {
				returnStr = fourteen;
			}
			else if (result == 15) {
				returnStr = fifteen;
			}
			else if (result == 16) {
				returnStr = sixteen;
			}
			else if (result == 17) {
				returnStr = seventeen;
			}
			else if (result == 18) {
				returnStr = eighteen;
			}
			else if (result == 19) {
				returnStr = nineteen;
			}
		}
		if (result > 20) {
			int count = 0;
			while(count < resultStr.length()) {
				if (count == 0) {
					if (resultStr.charAt(count) == '2') {
						returnStr += twenty + "-";
					}
					if (resultStr.charAt(count) == '3') {
						returnStr += thirty + "-";
					}
					if (resultStr.charAt(count) == '4') {
						returnStr += fourty + "-";
					}
					if (resultStr.charAt(count) == '5') {
						returnStr += fifty + "-";
					}
					if (resultStr.charAt(count) == '6') {
						returnStr += sixty + "-";
					}
					if (resultStr.charAt(count) == '7') {
						returnStr += seventy + "-";
					}
					if (resultStr.charAt(count) == '8') {
						returnStr += eighty + "-";
					}
					if (resultStr.charAt(count) == '9') {
						returnStr += ninty + "-";
					}
				}
				else if (count == 1) {
					if (resultStr.charAt(count) == '1') {
						returnStr += one;
					}
					if (resultStr.charAt(count) == '2') {
						returnStr += two;
					}
					if (resultStr.charAt(count) == '3') {
						returnStr += three;
					}
					if (resultStr.charAt(count) == '4') {
						returnStr += four;
					}
					if (resultStr.charAt(count) == '5') {
						returnStr += five;
					}
					if (resultStr.charAt(count) == '6') {
						returnStr += six;
					}
					if (resultStr.charAt(count) == '7') {
						returnStr += seven;
					}
					if (resultStr.charAt(count) == '8') {
						returnStr += eight;
					}
					if (resultStr.charAt(count) == '9') {
						returnStr += nine;
					}
				}
				count++;
			}
		}		
		return returnStr;
	}
}
