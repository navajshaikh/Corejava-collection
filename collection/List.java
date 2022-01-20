package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class List {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> number=new ArrayList<Integer>();
		number.add(10);
		number.add(20);
		number.add(50);
		number.add(100);
		number.add(0);
		
		number.remove(0);
		Collections.sort(number);
		
		System.out.println("ArrayList "+number);
		
		LinkedList<Integer> object=new LinkedList<Integer>();
		object.add(1);
		object.add(2);
		object.add(3);
		object.add(8);
		object.add(0);
		
		object.remove(1);
		
		System.out.println("LinkedList "+object);
		
	}

}
