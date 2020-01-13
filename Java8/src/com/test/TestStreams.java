package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreams {

	public static void main(String[] args) {
	
		
		List<Integer> intList = new ArrayList<Integer>();
		
		List<String> strList = new ArrayList<String>();
		
		for(int i =0; i < 100; i++) {
			
			intList.add(i);
			intList.add(i);
		}
			
		
		System.out.println("List Size without operation "+intList.size());
		
		List<Integer> intList2 = intList.stream().distinct().collect(Collectors.toList());
		
		List<Integer> intList3 = intList.stream().collect(Collectors.toList());
		
		System.out.println(intList2.size());
		System.out.println(intList3.size());
		
		Optional<String> gender = Optional.of("Male"); 
		
		
		intList.stream();
		Stream.of(intList);
		
		
	}
	
	
	
	
	

}
