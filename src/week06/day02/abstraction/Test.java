package week06.day02.abstraction;

public class Test {
	public static void main(String[] args) {
		Cat cat = new Cat("keddy",1);
		Dog dog = new Dog("Kopke",2);
		cat.makeSound();
		dog.makeSound();
		System.out.println();
		
		cat.playWithWoolBall();
		dog.bringTheStick();
		System.out.println();
		
		cat.sleep();
		dog.sleep();
		System.out.println();
		
		cat.eat();
		dog.eat();
		
		
	}
	
}