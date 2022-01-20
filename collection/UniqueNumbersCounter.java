package com.collection;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueNumbersCounter {

	Scanner sc = new Scanner(System.in);

	public static int[] findUniqueNumbersCount(int arr[], int elements) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] != arr[j]) {
					count++;
				}
			}
		}

		System.out.println("Total numbers in Array is :" + count);

//		Decending order

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
				arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}

		System.out.println("Maximum Unique Number is :" + arr[arr.length - 1]);

		// REMOVE DUPLICATE FROM ARRAY

		HashSet<Integer> obj = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			obj.add(arr[i]);
		}
		// System.out.println("Removed duplicates from array : "+obj);

		// SUBARRAY part

		ArrayDeque<Integer> subArray = new ArrayDeque<Integer>();

		subArray.addAll(obj);

		System.out.println("SubArray Is : " + subArray);
		return arr;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		UniqueNumbersCounter obj = new UniqueNumbersCounter();

		System.out.println("Enter number of elements :");
		int elements = sc.nextInt();
		System.out.println("Enter Elements in array :");
		int arr[] = new int[elements];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		UniqueNumbersCounter.findUniqueNumbersCount(arr, elements);

	}

}
