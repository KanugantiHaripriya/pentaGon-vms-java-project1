package Project1;

public class Vehicle {
	
	private String brand;
	private int Speed;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int speed) {
		Speed = speed;
	}
	
	void showDetails() {
		System.out.println("I am from vehocle class");
	}
}
