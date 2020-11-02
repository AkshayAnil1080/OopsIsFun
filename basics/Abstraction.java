package basics;

public class Abstraction {

	public static void main(String[] args) {
//		Car c1 = new Car();  // doesnt make sense;
		
		
		Audi a1 = new Audi();
		a1.start();
	}
}
class Audi extends Car
{
	void start()  
	{
		System.out.println("car is starting");
	}
}

class Bmw extends Car  // Bmq parent of  Car. Car cannot have children.
{
	 void start()  // method override
	{
		System.out.println("car is starting");
	}
}


abstract class Car   // Car is a concept: u dont need to create the object of it.
{
	String brand;
	int price;
	
	abstract void start();  // abs f(n) dont need defining
//	{
//		System.out.println("car is starting");
//	}
	void breaks()   //concrete functions
	{
		System.out.println("Car is breaking");
	}
}