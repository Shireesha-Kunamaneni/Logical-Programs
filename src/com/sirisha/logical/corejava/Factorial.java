package com.sirisha.logical.corejava;

import java.util.Scanner;

public class Factorial{

		public static void main(String[] args){
		    Scanner in = new Scanner(System.in);
		    System.out.println("Enter the number: ");
		    int num = in.nextInt();
		    int fact =1;
		    for(int i=num; i>0; i--){
		    fact = fact*i;
		    }
		    System.out.println("Factorial of "+num+" is "+fact);
		    }
		}