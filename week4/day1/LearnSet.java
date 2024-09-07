package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	
	public static void main(String[] args) {
		
		Set<String> names1 = new HashSet<String>();
		names1.add("Gokul");
		names1.add("Vinoth");
		names1.add("Vineeth");
		names1.add("Bhuvanesh");
		names1.add("Gokul");
		names1.add("Vinoth");
		names1.add("Vineeth");
		names1.add("Bhuvanesh");
		System.out.println("HashSet(Hashing Alogirthom --> "+names1);
		
		Set<String> names2 = new TreeSet<String>();
		names2.add("Gokul");
		names2.add("Vinoth");
		names2.add("Vineeth");
		names2.add("Bhuvanesh");
		names2.add("Gokul");
		names2.add("Vinoth");
		names2.add("Vineeth");
		names2.add("Bhuvanesh");
		System.out.println("TreeSet(ASCII Order --> "+names2);
		
		
		Set<String> names3 = new LinkedHashSet<String>();
		names3.add("Gokul");
		names3.add("Vinoth");
		names3.add("Vineeth");
		names3.add("Bhuvanesh");
		names3.add("Gokul");
		names3.add("Vinoth");
		names3.add("Vineeth");
		names3.add("Bhuvanesh");
		System.out.println("LinkedHashSet(Same/Insertion order) --->"+names3);
		
		System.out.println(names3.remove("Gokul"));		
		
		System.out.println(names3);
		
		//Convert the Set into List
		List<String> names = new ArrayList<String>(names3);
//		names.addAll(names3);
		System.out.println("Names are "+names);
		System.out.println(names.get(1));
		
		System.out.println("---------------------");
		
		
		Set<Integer> numbers = new TreeSet<Integer>();
		
		int[] num = {1,4,7,2,68,9,2,5,9,36,6,57,3,5};
		for (int i : num) {
			numbers.add(i);
		}
		
		System.out.println(numbers);
	}
	
	
	
	
}
