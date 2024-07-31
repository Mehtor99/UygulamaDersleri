package week06.day02.abstraction;

public non-sealed class Dog extends EvcilHayvan{
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Kopek hav dedi");
	}
	
	public void bringTheStick(){
		System.out.println(this.name+ " bringing the stick");
	}
}