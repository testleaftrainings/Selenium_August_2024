package week8.day2;

import java.util.Locale;

import com.github.javafaker.Faker;

public class GenerateUniqueTestData {

	public static void main(String[] args) {
		
		Faker fake = new Faker(new Locale("English","India"));
		String cname = fake.company().name();
		System.out.println("Company name: "+cname);
		String firstName = fake.name().firstName();
		System.out.println("First name: "+firstName);
		String lastName = fake.name().lastName();
		System.out.println("Last name: "+lastName);
		System.out.println("email: "+firstName+lastName+"@testleaf.com");
		String phoneNumber = fake.phoneNumber().phoneNumber();
		System.out.println("Phone number: "+phoneNumber);
		
	}

}
