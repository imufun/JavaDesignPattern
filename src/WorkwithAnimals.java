
public class WorkwithAnimals {

	// int justANum=10;

	public static void main(String[] a) {

		// System.out.println(justANum);

		Dog dog = new Dog();
		dog.digHole();
		dog.setName("Dog is good");
		System.out.println(dog.getname());

		dog.setWeight(-1);

		int randNum = 10;

		dog.changeVar(randNum);
		System.out.println("After mathod call " + randNum);
		System.out.println("Dog after change " + dog.getname());

		Animal doggi = new Animal();
		Animal katti = new Animal();

		System.out.println("Dogs Says :" + doggi.getSound());
		System.out.println("katti says :" + katti.getSound());

		Animal[] animals = new Animal[4];
		animals[0] = doggi;
		animals[1] = katti;

		System.out.println("Dogs Says : " + animals[0].getSound());
		System.out.println("katti says : " + animals[1].getSound());

		SpeakAnimal(doggi);

		// ((Dog)doggi).digHole();//

		WorkwithAnimals workwithAnimals = new WorkwithAnimals();
		dog.AccessPublic();

		saysHello();

		Giraffe giraffe = new Giraffe();
		giraffe.setName("Imran");
		System.out.println(giraffe.getName());

	}

	public static void nameChange(Dog dog) {
		dog.setName("Dog change");
	}

	public static void SpeakAnimal(Animal ranNumber) {
		System.out.println("Animal Says : " + ranNumber.getSound());
	}

	public static void saysHello() {
		System.out.println("Hello");
	}
}
