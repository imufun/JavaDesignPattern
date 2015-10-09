
public class Dog extends Animal {

	public void digHole() {
		System.out.println("Dog a hole");
	}

	public Dog() {
		super();
		setSound("Break");
		Flying = new CantFly();

	}

	public void changeVar(int randNum) {

		randNum = 12;
		System.out.println("Rand num is " + randNum);
	}

	private void AccessPrivate() {
		System.out.println("This Is private Method");
	}

	public void AccessPublic() {
		// System.out.println("This is Public method");
		AccessPrivate();
	}

}
