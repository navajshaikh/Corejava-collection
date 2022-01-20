package com.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Set {
	
	
	public static void main(String[] args) {
		
//		
//		
//		HashSet<Integer> number=new HashSet<Integer>();
//		
//		number.add(1);
//		number.add(3);
//		number.add(2);
//		number.add(2);
//		
//		System.out.println(number);
//		
//		
//		TreeSet<String> animal=new TreeSet<String>();
//		animal.add("z");
//		animal.add("a");
//		
//		
//		System.out.println(animal);
		
		Scanner sc=new Scanner(System.in);
		TreeSet<String> purchase=new TreeSet<String>();
		System.out.println(" Cart Size [3]");
		System.out.println("Add your purched products: ");
		int quantity=0;
		
		int x=0;
		
		
		String a[]= new String[3];
		for(int i=0;i<3;i++) {
			
			 a[i]=sc.next();
			 purchase.add(a[i]);
			
			 
			 
			quantity+=i;
			
			
		}
	
	
	System.out.println("List Of Items You Purchased: "+purchase +x);
	System.out.println("Total items purchased "+quantity);
	
	
	}
		
	}
//Tape
//Pen
//Eraser