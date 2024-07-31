package week06.day02.abstraction;

public abstract sealed class EvcilHayvan permits Cat,Dog {
	protected String name;
	protected int age;
	
	public EvcilHayvan(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat(){
		System.out.println(this.getName() +" eating...");
	}
	
	public abstract void makeSound();
	
	public void sleep(){
		System.out.println(this.getName() + "Sleeping...");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}