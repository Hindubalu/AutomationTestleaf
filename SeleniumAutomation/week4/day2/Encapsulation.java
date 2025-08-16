package week4.day2;

public class Encapsulation {
	// binding of two variable or methods in one unit/ into a single unit
	// private and protected access modifier is used
	// this - keyword used to call the current class object or methods
	// set method is used to set variables and it is void return type
	// get method is used to return the values and it should return any type
	
	// selenium example--> threadLocal (testNG)
	
	private int pin;
	private int age;
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		Encapsulation encap=new Encapsulation();
		encap.setPin(1723);
		encap.setAge(19);
		System.out.println("PIN: "+encap.getPin());
		System.out.println("Age: "+encap.getAge());
		
	}

}
