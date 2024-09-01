package week3.day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		//interface objectname = new implementation class()
		List<String> mentors = new ArrayList<String>();
		mentors.add("Vinoth");
		mentors.add("Vineeth");
		mentors.add("Mukesh");
		mentors.add("Muthu");
		mentors.add("Dilip");
		System.out.println(mentors);
		mentors.add(0, "Gokul");
		System.out.println(mentors);
		mentors.remove(0);
		System.out.println(mentors);
		mentors.add("Arun");
		mentors.add("Arun");
		mentors.remove("Arun");
		
		System.out.println(mentors);
		System.out.println(mentors.size());
		
		//index starts from zero 
		
		System.out.println(mentors.get(5));
		
		System.out.println(mentors.remove("Ajay"));
		System.out.println(mentors.remove(5));
		
		
		List<String> coaches = new LinkedList<String>();
		coaches.add("Babu");
		coaches.add("Hari");
		coaches.add("Shan");
		System.out.println(coaches);
		
		System.out.println(mentors);
		mentors.addAll(coaches);
		System.out.println("Add all coaches"+mentors);
		mentors.addAll(0,coaches);
		System.out.println("Add all coaches in index zero"+mentors);
		
		mentors.removeAll(coaches);
		System.out.println(mentors);
		
	}
	
	
}
