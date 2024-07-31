package week06.day02.abstraction;

public non-sealed class Cat extends EvcilHayvan{
	
	
	public Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Kedi Miyav dedi.");
	}
	
	public void playWithWoolBall(){
		System.out.println(this.name+ "playing with wool ball");
	}
}