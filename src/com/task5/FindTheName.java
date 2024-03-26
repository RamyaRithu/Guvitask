package com.task5;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class FindTheName {
	
	
	    public static void main(String[] args) {
	        List<String> studentNames = Arrays.asList("Arun", "Bablu", "Charan", "Ammu", "Abi", "Anna", "Ramya", "Ajith", "Ava", "Sophia");

	        List<String> studentsWithA = studentNames.stream()
	                .filter(name -> name.startsWith("A"))
	                .collect(Collectors.toList());

	        System.out.println("Students whose names start with 'A': " + studentsWithA);
	    }
	}



