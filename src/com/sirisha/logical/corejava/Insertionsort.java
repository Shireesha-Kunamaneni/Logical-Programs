package com.sirisha.logical.corejava;


	public class Insertionsort {  
	    static void insertionsorting(int[] a) {  
	          int n = a.length;  
	        for (int j = 1; j < n; j++) {  
	            int key = a[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( a [i] > key ) ) {  
	                a [i+1] = a [i];  
	                i--;  
	            }  
	            a[i+1] = key;  
	        }    
	    }  
	    public static void main(String[] args) {  
	                int a[] ={2,30,55,22,5,547,97};  
	                 
	                System.out.println("Before Insertion Sort");  
	                for(int i=0; i < a.length; i++){  
	                        System.out.print(a[i] + " ");  
	                }  
	                System.out.println();  
	                  
	                insertionsorting(a);
	                 
	                System.out.println("After Insertion Sort");  
	                for(int i=0; i < a.length; i++){  
	                        System.out.print(a[i] + " ");  
	                }  
	   
	        }  
	}