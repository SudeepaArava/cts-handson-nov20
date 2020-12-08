package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		List<Items> list = new ArrayList<Items>();
		list.add(new Items(200, "TV", 45000));
		list.add(new Items(100, "Mobile", 20000));
		list.add(new Items(300, "Laptop", 30000));
		System.out.println("List by Id in asc order");
		Collections.sort(list,new Comparator<Items>() {
			public int compare(Items i1,Items i2) {
				return i1.getId()-i2.getId();
			}
		});
		list.forEach(e -> System.out.println(e));
		System.out.println("List by Id in Desc order");
		Collections.sort(list,new Comparator<Items>() {
			public int compare(Items i1,Items i2) {
				return i2.getId()-i1.getId();
			}
		});
		list.forEach(e -> System.out.println(e));
		System.out.println("List by Name in asc order");
		Collections.sort(list,new Comparator<Items>() {
			public int compare(Items i1,Items i2) {
				return i1.getName().compareTo(i2.getName());
			}
		});
		list.forEach(e -> System.out.println(e));
		System.out.println("List by Name in desc order");
		Collections.sort(list,new Comparator<Items>() {
			public int compare(Items i1,Items i2) {
				return i2.getName().compareTo(i1.getName());
			}
		});
		list.forEach(e -> System.out.println(e));
		System.out.println("List by Salary in asc order");
		Collections.sort(list,new Comparator<Items>() {
			public int compare(Items i1,Items i2) {
				return (int)(i1.getPrice()-i2.getPrice());
			}
		});
		list.forEach(e -> System.out.println(e));
		System.out.println("List by salary in desc order");
		Collections.sort(list,new Comparator<Items>() {
			public int compare(Items i1,Items i2) {
				return (int)(i2.getPrice()-i1.getPrice());
			}
		});
		list.forEach(e -> System.out.println(e));
		
	}

}
