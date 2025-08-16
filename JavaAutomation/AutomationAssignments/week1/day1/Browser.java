package week1.day1;

public class Browser {

	public static void main(String[] args) {
		System.out.println("This is BROWSER Class\n");
		Chrome object=new Chrome();
		System.out.println("Calling the method in other class by creating a object\n");
		System.out.println("First Method");
		object.getName();
		System.out.println("\nSecond Method");
		object.printName();

	}

}
