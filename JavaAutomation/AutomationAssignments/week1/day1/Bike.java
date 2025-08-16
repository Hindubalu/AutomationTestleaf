package week1.day1;

public class Bike {
	public static void main(String[] args) {
		
		System.out.println("Methods in Bike Class");
		Bike bike=new Bike();
		bike.bikeColor();
		
		System.out.println("\nMethods in Car Class");
		Car car=new Car();
		car.applyBreak();
		car.soundHorn();
	}
	
	public void bikeColor() {
		System.out.println("The color of bike is black");
	}

}
