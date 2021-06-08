
public abstract class Animal {

	int legs;
	int age;
	String name;
	
	public Animal(int legs, int age, String name) {
		
		this.legs = legs;
		this.age = age;
		this.name = name;
		
	}
	
	public void makeSound() {
		
		System.out.println("Animal makes animal sound");
		
		
	}
	
}
