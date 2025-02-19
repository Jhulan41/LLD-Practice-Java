package low_Level_Design_practice;

class Vehicle {
	protected String brand = "Ford"; // Vehicle attribute

	public void honk() { // Vehicle method
		System.out.println("Jalwa hai hamara");
	}
}

class Car extends Vehicle {
	public String model = "Mustang";

}

public class Inheritence {

	public static void main(String[] args) {
		Car myCar = new Car();

		// Call the honk() method (from the Vehicle class) on the myCar object
		myCar.honk();

		// Display the value of the brand attribute (from the Vehicle class) and the
		// value of the modelName from the Car class
		System.out.println(myCar.brand + " " + myCar.model);
	}
}
