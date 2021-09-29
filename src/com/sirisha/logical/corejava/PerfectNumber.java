package com.sirisha.logical.corejava;

public class PerfectNumber {

	public boolean checkPerfectNum(int n){

	        int t = 0;
	        for(int i=1;i<=n/2;i++){
	            if(n%i == 0){
	                t += i;
	            }
	        }
	        if(t == n){
	            System.out.println(n + " is a perfect number");
	            return true;
	        } else {
	            System.out.println(n + " is not a perfect number");
	            return false;
	        }
	    }

	    public static void main(String a[]){
	    	PerfectNumber obj = new PerfectNumber();
	        obj.checkPerfectNum(82);
	    }
	}