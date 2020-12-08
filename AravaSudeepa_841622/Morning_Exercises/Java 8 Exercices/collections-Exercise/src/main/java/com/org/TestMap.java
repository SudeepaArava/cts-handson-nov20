package com.org;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		//<String, List<String>> map = new HashMap();
		Map<String, ArrayList<String>> map1 = new HashMap<String, ArrayList<String>>();
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Rahul");
		list1.add("Raju");
		list1.add("David");
		map1.put("EC",list1);
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Arjun");
		list2.add("Alex");
		list2.add("Deepa");
		map1.put("cs",list2);
		System.out.println(map1);
		
	}
}
