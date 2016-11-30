class Dog{
	int size;
	String breed;
	String name;

	void bark(){
		System.out.println("Ruff! Ruff!");
	}
	void setSize(int size1){
		size = size1;
	}
	int getSize(){
		return size;
	}
	boolean isBigger(Dog d){
		if(size>d.getSize()){
			return true;
		}
		else{
			return false;
		}
	}
}

class DogTestDrive{
	public static void main(String[] args){
		Dog [] d = new Dog[3];
		d[0] = new Dog();
		d[1] = new Dog();
		d[2] = new Dog();
		d[0].setSize(40);
		d[0].breed = "vicky";
		d[1].setSize(200);
		d[1].breed = "liz";
		d[2].setSize(10);
		d[2].breed = "sarah";
		int biggestSize = 0;
		int i = 0;
		int big = 0;
		while(i<2){
			d[i].bark();
			if(d[i].isBigger(d[i+1])){
				biggestSize = d[i].getSize();
				big = i;
			}
			else{
				biggestSize = d[i+1].getSize();
				big = i+1;
			}
			i++;
		}
		System.out.println("The biggest dog size is: " + d[big].size);
		System.out.println("The breed of the biggest dog is: " + d[big].breed);
	}
}