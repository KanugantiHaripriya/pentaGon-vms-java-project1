package Project1;

public class Test {

	public static void main(String[] args) {
		Vehicle vc=new Car(); // upcasting
		Vehicle vb=new Bike(); // upcasting
		
		Car c = (Car)vc; //downcasting
		Bike b=(Bike)vb; //downcasting
		
		c.fuelType="petrol"; 
		b.engineCC=1000;
		vc.showDetails();
		vb.showDetails();
		
		vc.setBrand("Range Rover");
		vc.setSpeed(1000);
		
		vb.setBrand("BMW");
		vb.setSpeed(1000);
		
		System.out.println("Brand is : "+ vc.getBrand());
		System.out.println("Speed is : "+ vc.getSpeed());
		
		System.out.println("Brand is : "+ vb.getBrand());
		System.out.println("Speed is : "+ vb.getSpeed());

	}
}

/*
output is:
Car fuel Type is : petrol
Bike engine cc is : 1000
Brand is : Range Rover
Speed is : 1000
Brand is : BMW
Speed is : 1000
*/
