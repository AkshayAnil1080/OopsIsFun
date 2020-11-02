package basics;

import encapsualtions.EncapsultaionsIntro;

public class MainClass {
	
	public static void main(String[] args) {
		
		
//		Person p1 = new Person();
//		p1.age = 24;
//		p1.name = "Akshay";
//		
//		Person p2= new Person(32 , "Shivam Sharma");
//		p2.age = 32;
//		p2.name ="Shivam";
		
//		System.out.println(p2.age + " "+ p2.name);
//		System.out.println(p1.age + " " + p1.name);
		
//		p1.eat();
//		p2.walk();
//		p2.walk(2);   // polymorphism
		// which function to be called is compile time polymorphism
		
//		System.out.println(Person.count);
		
//		Developer d1 =new Developer(22, "Akshay");
//		 d1.walk();
		EncapsultaionsIntro obj = new EncapsultaionsIntro();
		obj.doWork();
	}

}
class Developer extends Person
{

	public Developer(int age, String name) {
		super(age, name);  // super use to access prop  of its parent constructor.
		}
	void walk()   // now this is run time polymorphism
	{
		System.out.println("Developer " + name + " is walking.");
	}
	
}

class Person
{
	String name;
	int age;
	
	static int count;  // obj cannot access it now ony class can. line 24
	
//	public Person()
//	{
//		count++;
//		System.out.println("creating an object");
//	}
	
	public Person(int age , String name)
	{
	//	this();   // 1. with one constructor call another
		this.name  = name;
		this.age = age; // 2, use this to access the parameters of current  constructor
		
	}
	
	void walk()
	{
		System.out.println(name + " is walking");
	}
	void eat()
	{
		System.out.println(name + " is eating");
	}
	void walk(int steps)
	{
		System.out.println(name + " walked " + steps + " steps");
	}
	
	void doWork()
	{
		System.out.println("Person is working");
	}
	
}