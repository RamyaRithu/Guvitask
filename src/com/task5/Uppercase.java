package com.task5;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Uppercase {
	

	    public static void main(String[] args) {
	        Stream<String> names = Stream.of("aBc", "d", "du");

	        List<String> upperCaseNames = names.map(String::toUpperCase)
	                                           .collect(Collectors.toList());

	        System.out.println("Original List: " + Stream.of("aBc", "d", "du").collect(Collectors.toList()));
	        System.out.println("List after converting to uppercase: " + upperCaseNames);
	    }
	}



