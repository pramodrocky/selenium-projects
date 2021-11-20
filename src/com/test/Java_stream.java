package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Java_stream {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("abhi");
		a.add("rahul");
		a.add("ajohn");
		a.add("array");

		// Stream.of("abhi","rahul","ajohn","array").filter(s->s.length()>3).limit(5).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		// System.out.println("************");
		// Stream.of("azhi","rahul","ajohn","abray").filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		/*
		 * long sup=a.stream().filter(r->r.startsWith("a")).count();
		 * System.out.println(sup);
		 */

		String[] con = { "pramod", "fran", "deepak" };
		List al = Arrays.asList(con);

		Stream<String> all = Stream.concat(a.stream(), al.stream());

		boolean flag = all.anyMatch(s -> s.equalsIgnoreCase("array"));
		Assert.assertTrue(flag);
		System.out.println(flag);

		{
			List<String> kin = Stream.of("tarun", "pooja", "bens").filter(d -> d.length() > 3).filter(d->d.startsWith("b"))
					.map(s -> s.toUpperCase())
					.collect(Collectors.toList());
			System.out.println(kin.get(0));
			
			Stream.of(1,2,3,4,5,5,5,5,5,5,5).distinct().forEach(d->System.out.println(d));
			System.out.println("*************");
			List<Integer> du=Stream.of(1,2,3,4,5,5,5,5,5,5,5).distinct().collect(Collectors.toList());
			System.out.println(du.get(3));

		}
	}
}
