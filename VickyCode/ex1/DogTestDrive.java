class Animal{
	int size;
	String breed;
	String name;

	void bark(){
		System.out.println("I'm a generic animal.");
	}
}

class Dog extends Animal{
	void bark(){
		System.out.println("Ruff! Ruff!");
	}
}

class Cat extends Animal{
	void bark(){
		System.out.println("I am a cat");
	}
}

class DogTestDrive{
	public static void main(String[] args){
		Dog d = new Dog();
		d.size = 40;
		d.bark();
		Cat c = new Cat();
		c.breed = "Maine Coon";
		c.bark();
		Animal a = new Animal();
		a.bark();
	}
}