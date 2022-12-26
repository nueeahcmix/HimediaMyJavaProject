package test;

interface Soundable {
	public abstract String sound();
}

class Cat implements Soundable {

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class Dog implements Soundable {

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

public class SoundEx {
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	

	public static void main(String[] args) {
		printSound(new Cat());	//야옹
		printSound(new Dog());	//멍멍
		
	}

	
	Soundable soundable = new Cat();
	Soundable soundable = new Dog();
}
