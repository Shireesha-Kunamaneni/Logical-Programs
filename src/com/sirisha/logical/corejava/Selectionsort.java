package com.sirisha.logical.corejava;

public class Selectionsort {

	    static void selectionsorting(int[] a) {  
	         for (int i = 0; i < a.length - 1; i++)  
	        {  
	            int k = i;  
	            for (int j = i + 1; j < a.length; j++){  
	                if (a[j] < a[k]){  
	                    k = j;
	                }  
	            }  
	            int smallNum = a[k];   
	            a[k] = a[i];  
	            a[i] = smallNum;  
	        }  
	  
	    }  
	    public static void main(String[] args) {  
	                int a[] ={2,30,55,22,5,547,97};  
	                 
	                System.out.println("Before Selction Sort");  
	                for(int i=0; i < a.length; i++){  
	                        System.out.print(a[i] + " ");  
	                }  
	                System.out.println();  
	                  
	                selectionsorting(a);
	                 
	                System.out.println("After Selection Sort");  
	                for(int i=0; i < a.length; i++){  
	                        System.out.print(a[i] + " ");  
	                }  
	   
	        }  
	}