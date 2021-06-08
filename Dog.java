
public class Dog extends Animal implements Mammals {

	public Dog(int legs, int age, String name) {
		
		super(legs, age, name);
		
	}
	
	public void giveBirth() {
		System.out.println("Gave birth to 3 puppies");
	}
	
	@Override
	public void makeSound() {
		
		System.out.println("Dog go woof woof");
	}
}
