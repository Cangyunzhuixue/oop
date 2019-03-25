package elemOfopp.day4;

public class TestAnimal {
public static void main(String[] args) {
	TestAnimal testAnimal=new TestAnimal();
	testAnimal.func(new Animalse());
	testAnimal.func(new Dogs());
	testAnimal.func(new Cat());;
}
public void func(Animalse animal) {
	animal.eat();
	animal.jump();
	if (animal instanceof Cat) {
		Cat cat= (Cat)animal;
		cat.hobby();
	}
	if (animal instanceof Dogs) {
		Dogs dogs=(Dogs)animal;
		dogs.hobby();
	}
}
}
class Animalse{
	String name;
	 int age;
	 public void eat() {
		System.out.println("eat");
	}
	 public void jump() {
		System.out.println("jump");
	}
}
class Dogs extends Animalse{
	public void eat() {
		System.out.println("dog eats");
	}
	public void jump() {
		System.out.println("dog jump");
	}
	public void hobby() {
		System.out.println("dog aichigutou");
	}
	

}
class Cat extends Animalse{
	public void eat() {
		System.out.println("cat eats");
	}
	public void jump() {
		System.out.println("cat jump");
	}
	public void hobby() {
		System.out.println("cat aichiyu");
	}
}