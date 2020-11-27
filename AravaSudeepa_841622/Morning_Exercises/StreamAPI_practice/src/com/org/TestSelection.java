package com.org;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class TestSelection {

	public static void main(String[] args) throws IOException {

		List<Laptop> laptops=Laptop.fetchLaptops();
		
		List<Laptop> partlaptops=laptops.stream()
		 .filter(item -> item.getBrandName().equals("Hp"))
		 .filter(item -> item.getPrice() > 30000)
		 .sorted((i1,i2) -> Double.compare(i2.getRating(), i1.getRating()))
		 .collect(Collectors.toList());
		
		partlaptops.forEach(e -> System.out.println(e));
	}
}
