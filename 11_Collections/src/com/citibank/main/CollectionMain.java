package com.citibank.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionMain {

	public static void main(String[] args) {
		System.out.println("Main Start....");
		
		System.out.println("1. ArrayList");
		List<String> nameList = new ArrayList<>();
		System.out.println("Name List size:::" + nameList.size());
		System.out.println("Name List:::" + nameList);
		
		nameList.add("Amol");
		nameList.add("Keshav");
		nameList.add("Shitole");
		nameList.add("Keshav");
		
		System.out.println("Name List size:::" + nameList.size());
		System.out.println("Name List:::" + nameList);
		System.out.println("Name at index 2:::" + nameList.get(1));
		System.out.println(nameList.remove(1));
		System.out.println("Name List:::" + nameList);
		
		System.out.println("---------------------");
		System.out.println("2. HashSet");
		Set<Integer> numberSet = new HashSet<Integer>();
		
		System.out.println("numberSet Size:::" + numberSet.size());
		System.out.println("numberSet::" + numberSet);
		
		numberSet.add(101);
		numberSet.add(1);
		numberSet.add(91);
		numberSet.add(88);
		numberSet.add(101);
		
		System.out.println("After adding...");
		System.out.println("numberSet Size:::" + numberSet.size());
		System.out.println("numberSet::" + numberSet);
		
		System.out.println("---------------------");
		System.out.println("3. TreeSet");
		Set<String> nameTreeSet = new TreeSet<String>();
		
		System.out.println("nameTreeSet Size:::" + nameTreeSet.size());
		System.out.println("nameTreeSet::" + nameTreeSet);
		
		nameTreeSet.add("B");
		nameTreeSet.add("a");
		nameTreeSet.add("Z");
		nameTreeSet.add("P");
		
		System.out.println("After adding...");
		System.out.println("nameTreeSet Size:::" + nameTreeSet.size());
		System.out.println("nameTreeSet::" + nameTreeSet);
		
		System.out.println("Main Ends....");
	}

}
