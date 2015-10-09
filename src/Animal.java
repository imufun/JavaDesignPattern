
public class Animal {

	private String name;
	private int weight;
	private String sound;

	public Flay Flying;

	public void setName(String newname) {
		name = newname;
	}

	public String getname() {
		return name;
	}

	public void setWeight(int newWeight) {
		if (newWeight > 0) {
			weight = newWeight;
		} else {
			System.out.println("Weight must be grater theb 0");
		}
	}

	public int getWeight() {
		return weight;
	}

	public void setSound(String newSound) {
		sound = newSound;
		System.out.println("");
	}

	public String getSound() {
		return sound;
	}

	public String trytoFly() {
		return Flying.fly();
	}

	public void setFlyingAbility(Flay newFly) {
		Flying = newFly;
	}
}
