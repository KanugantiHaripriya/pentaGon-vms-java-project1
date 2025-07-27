package Project1;

public class Bike extends Vehicle{
	
	int engineCC;

	@Override
	void showDetails() {
		System.out.println("Bike engine cc is : "+engineCC);
	}
	
}
