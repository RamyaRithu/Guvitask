package com.task5;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class EmptyorNot {
	
	
	    public static void main(String[] args) {
	        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

	        List<String> nonEmptyStrings = strings.stream()
	                .filter(s -> !s.isEmpty())
	                .collect(Collectors.toList());

	        System.out.println("Original List: " + strings);
	        System.out.println("List with non-empty strings: " + nonEmptyStrings);
	    }
	}



