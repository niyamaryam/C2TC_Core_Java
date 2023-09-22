package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {
    public static void main(String[] args) {
        // Creating a stream of integers
        Stream<Integer> stream = Stream.of(10, 20, 30, 40, 50, 60, 70);

        // Counting the number of elements in the stream and printing the count
        System.out.println("Count of elements: " + stream.count());

        // Creating an array of integers
        Integer[] values = { 10, 20, 30, 40, 11, 10, 11, 12, 13 };

        // Printing the squares of the elements in the array
        System.out.println("Square of " + Arrays.toString(values) + " is as follows:");
        
        Arrays.stream(values)
              .map(m -> m * m) // Square each element
              .forEach(System.out::println);

        // Printing the first 2 elements of the array
        System.out.print("First 2 elements are:\n");
        Arrays.stream(values)
              .limit(2)
              .forEach(System.out::println);

        // Printing elements except the first 4
        System.out.println("Elements except first 4: ");
        Arrays.stream(values)
              .skip(4)
              .forEach(System.out::println);

        // Printing distinct elements in the array
        System.out.println("Distinct elements are:");
        Arrays.stream(values)
              .distinct()
              .forEach(System.out::println);
        
        List<String> words = Arrays.asList("hello", "stream", "learning");

        // Convert the list to a stream
        Stream<String> stream1 = words.stream();

        // Map each string to uppercase and collect the results into a new list
        List<String> uppercaseList = stream1.map(str -> str.toUpperCase())
                                          .collect(Collectors.toList());

        // Print the uppercase list
        System.out.println(uppercaseList);
    }

    }

