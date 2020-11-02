package basics;
//making a Trans']]['[]]['[[[']\

public class Interfaces implements Car,Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start() {
		System.out.println(" my car is starting");
	}
		
		
		@Override
		public void walk() {
			System.out.println(" my car is walking");
	}

}

interface Car
{
	void start(); // by default is public and abstarct=>
	// =>  u cannnot define its body;
	// => u cannot  make concrete functions too.
}

interface Person{
	void walk();
}