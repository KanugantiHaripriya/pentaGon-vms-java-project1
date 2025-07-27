package Project1;

public class Car extends Vehicle {
	
	String fuelType;

	@Override
	void showDetails() {
		System.out.println("Car fuel Type is : "+fuelType);
	}
}
