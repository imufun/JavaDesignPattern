package FactoryDesignPattern;

public abstract class EnemyShip {

	private String name;
	private double amtDamage;

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void setDamage(double newDamage) {
		amtDamage = newDamage;
	}

	public double getDamage() {
		return amtDamage;
	}

	public void followHeroShip() {
		System.out.println(getName() + "is following the Hero Ship");
	}

	public void displayEnemyShip() {

		System.out.println(getName() + " is on the screen ");
	}

	public void enemyShipShoots() {
		System.out.println(getName() + " attacks and does " + getDamage() + " damage to hero");
	}

}
