package com.sirisha.logical.corejava;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args){
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    int num = s.nextInt();
	    int a = num, r=0, result=0;
	 
	    while(a!=0){
	    r = a%10;
	    a = a/10;
	    result = result + r*r*r;
	    }
	    if(result==num){
	        System.out.println(num+" is an armstrong number.");
	    }
	    else{
	        System.out.println(num+" is not an armstrong number.");
	    }
	    }
	}