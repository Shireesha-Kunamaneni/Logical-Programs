package com.sirisha.logical.corejava;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Software Industry";
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2 = str2.reverse();//using stringbuilder to reverse a string
		System.out.println("Reverse a String:" +str2);
		
	}

}
