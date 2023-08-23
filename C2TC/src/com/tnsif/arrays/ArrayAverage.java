package com.tnsif.arrays;

import java.util.Scanner;

public class ArrayAverage {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[16];

        // Input elements from the user
        System.out.println("Enter 16 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of the elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / array.length;

        // Display the array elements
        System.out.print("Array elements: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Average of the elements: " + average);
    }
    }
    


