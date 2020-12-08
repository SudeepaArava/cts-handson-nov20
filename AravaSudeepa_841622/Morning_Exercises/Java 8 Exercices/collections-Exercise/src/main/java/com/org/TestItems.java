package com.org;

import java.util.ArrayList;
import java.util.List;

public class TestItems {

	public static void main(String[] args) {

		List<Items> list=new ArrayList<Items>();
		list.add(new Items(11,"laptop","lap1234"));
		list.add(new Items(12,"TV","tv3452"));
		list.add(new Items(15,"Desktop","desk6789"));
		list.add(new Items(16,"phones","phone2355"));
		
		for(Items item:list)
		{
			if(item.getName().length() > 5)
				System.out.println(item.getName());
		}
	}

}
