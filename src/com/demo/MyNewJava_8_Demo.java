package com.demo;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyNewJava_8_Demo {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		l.add("nitin");
		l.add("sachin");
		l.add("anup");
		l.add("ajay");

		System.out.println("---------------------record that start with 'a' in List------------------------");
		List<String> startWith = l.stream().filter(s -> s.startsWith("n")).collect(Collectors.toList());
		System.out.println(startWith);
		System.out.println();

		System.out.println("---------------------(Assending)start with 'a' in List------------------------");
		List<String> sortedName = l.stream().filter(s -> s.startsWith("a")).sorted().collect(Collectors.toList());
		System.out.println(sortedName);
		System.out.println();

		System.out.println("---------------------(Descending)starts with 'a' in List------------------------");
		List<String> sortedNameDesending = l.stream().filter(s -> s.startsWith("a")).sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(sortedNameDesending);
		System.out.println();

		System.out.println("---------------------upper case that starts with 'a' in List------------------------");
		List<String> uppercase = l.stream().filter(s -> s.startsWith("a")).map(s -> s.toUpperCase()).sorted()
				.collect(Collectors.toList());
		System.out.println(uppercase);
		System.out.println();

		System.out.println("---------------------any record starts with 'a' in List------------------------");
		boolean anyMatch = l.stream().anyMatch(s -> s.startsWith("x"));
		System.out.println(anyMatch);
		System.out.println();

		System.out.println("---------------------all record starts with 'a' in List------------------------");
		boolean allMatch = l.stream().allMatch(s -> s.startsWith("a"));
		System.out.println(allMatch);
		System.out.println();

		System.out.println("---------------------count records starts with 'a' in List------------------------");
		long count = l.stream().filter(s -> s.startsWith("a")).count();
		System.out.println(count);
		System.out.println();

		System.out.println("---------------------convert list of integer into stream------------------------");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		Stream<Integer> streamOfInteger = list.stream();
		streamOfInteger.forEach(s -> System.out.print(s + " "));
		System.out.println();

		System.out.println("---------------------convert list of String into stream------------------------");
		List<String> list1 = Arrays.asList("ram", "sham", "pream", "gopal");
		Stream<String> streamOfString = list1.stream();
		streamOfString.forEach(s -> System.out.print(s + " "));
		System.out.println();

		System.out.println("---------------------Total addition of array or list------------------------");
		List<Integer> ll = new ArrayList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		Integer integer2 = ll.stream().reduce((x1, x2) -> x1 + x2).get();
		System.out.println("Total addition of List is : " + integer2);
		System.out.println();
		// OR
		Integer[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Integer integer = Arrays.stream(a).reduce((i1, i2) -> i1 + i2).get();
		System.out.println("Total addition of Array is : " + integer);
		System.out.println();

		System.out.println("---------------------Create stream object------------------------");
		Stream<String> s = Stream.of("Gaurav", "Salim", "Omkar", "Vishal");
		s.forEach(v -> System.out.println(v));
		System.out.println();
		// OR
		Stream<Integer> st = Stream.of(1, 2, 3, 4, 5, 4, 78, 4);
		st.forEach(v1 -> System.out.println(v1));
		System.out.println();

		System.out.println("---------------------Total addition of stream------------------------");
		Stream<Integer> stream = Stream.of(11, 23, 45, 6, 2, 62, 66, 4, 87);
		Integer additonOfStream = stream.reduce((i1, i2) -> i1 + i2).get();
		System.out.println(additonOfStream);

		System.out.println("---------------------find even no is greter than 20------------------------");
		Integer b[] = { 1, 23, 5, 6, 2, 75, 80 };
		List<Integer> evenNo = Arrays.stream(b).filter(r -> r > 20).filter(r -> r % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(evenNo);

		System.out.println("---------------------max no------------------------");
		Integer max = Arrays.stream(b).max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(max);

		Integer integer3 = ll.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(integer3);

	}

}
