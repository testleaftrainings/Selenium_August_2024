package week2.day1;

public class Car {
// the member of the class are methods and variables
	String colour = "Red"; // global variable -- it can access anywhere in the class
	int noOfWheels = 4;
	String carName = "Mini cooper country man";
	int noOfMirrors = 2;
	boolean isWorking = true;
	
	//method signature - AM/AS returnType methodName(input args){}
	// In java all the keywords starts with lowercase
	
	public void driveCar() {
		System.out.println("Drive a car");
		System.out.println(noOfMirrors);
	}
	
	public void parkCar() {
		System.out.println("Park the car");
		System.out.println(noOfWheels);
	}
	
	
	public void playMusic() {
		System.out.println("Play music");
//		System.out.println(noOfSeats);
	}
	
	//In java it will execute only the main method
	public static void main(String[] args) {
		
		System.out.println("This is from main method");
//		System.out.println(colour);
		//syntax to create object/instance for the class
			// classname objectName/objectReferance = new classname ();
		Car person1 = new Car(); // new Car() ---> this object , countryMan --> objectReferance
		//dataType varibale = value
		int noOfSeats = 4; //localVaribale-- it can be access only with in that method
		System.out.println(person1.carName);
		System.out.println(person1.colour);
		System.out.println(person1.isWorking);
		person1.driveCar();
		person1.playMusic();
		person1.driveCar();
		person1.driveCar();
		person1.driveCar();
		person1.driveCar();
		person1.driveCar();
		person1.driveCar();
		person1.driveCar();
		System.out.println("---------Person2-----------");
		Car person2 = new Car();
		System.out.println(person2.colour);
		//if person2 change his car colour it will change for person1 ?
		person2.colour = "Green";
		System.out.println(person2.colour);
		System.out.println(person1.colour);
		
		System.out.println(noOfSeats);
	}
	
}
