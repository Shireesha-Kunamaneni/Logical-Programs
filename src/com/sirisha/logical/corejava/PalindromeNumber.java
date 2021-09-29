package com.sirisha.logical.corejava;

import java.util.Scanner;

public class PalindromeNumber {

	      static int checkpalindrome(int num){
	            int newN = 0, rem, temp;
	            temp = num;
	            //find sum of all digit's of the number.
	            while(temp != 0){
	                  rem = temp % 10;
	                  newN = newN*10 + rem;
	                  temp = temp/10;
	            }
	            //Check if sum of all digit's of the number
	            //is equal to the given number or not.
	            if(newN == num){
	                  System.out.println(num +" is palindrome.");
	            }else{
	                  System.out.println(num +" is not palindrome.");
	            }
	            return newN;
	      }    

	      public static void main(String args[]){
	             Scanner s = new Scanner(System.in);
	            System.out.println("Enter the Number: ");
	            int no = s.nextInt();

	            int n = checkpalindrome(no);
	            System.out.println("Reverse of a number :" +n);
	      }
	}