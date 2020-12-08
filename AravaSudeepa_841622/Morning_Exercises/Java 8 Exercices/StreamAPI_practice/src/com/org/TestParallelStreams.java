package com.org;

import java.util.List;

public class TestParallelStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<Laptop> laptop=Laptop.fetchLaptops();
		System.out.println("...seq sorting.....");
       laptop.stream().filter(i -> i.getRating() > 3.0)
            .forEach(i -> System.out.println(i));
       
       System.out.println("... Parellel sorting....");
		laptop.parallelStream()
				.filter(i -> i.getBrandName().equals("Lenovo"))
				.forEach(i -> System.out.println(i));

	}

}
