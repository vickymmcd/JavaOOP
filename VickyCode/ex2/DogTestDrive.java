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
		Dog [] d = new Dog[3];
		d[0] = new Dog();
		d[1] = new Dog();
		d[2] = new Dog();
		d[0].size = 40;
		d[0].breed = "vicky";
		d[1].size = 200;
		d[1].breed = "liz";
		d[2].size = 10;
		d[2].breed = "sarah";
		int biggestSize = 0;
		int i = 0;
		int big = 0;
		while(i<3){
			d[i].bark();
			if(d[i].size>biggestSize){
				biggestSize = d[i].size;
				big = i;
			}
			i++;
		}
		System.out.println("The biggest dog size is: " + d[big].size);
		System.out.println("The breed of the biggest dog is: " + d[big].breed);
	}
}