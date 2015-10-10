package FactoryDesignPattern;

public class EnemyShipFactory {
	public EnemyShip mekeEnemyShip(String newShipType) {
		EnemyShip newShip = null;

		if (newShipType.equals("U")) {
			return new UFOEnemyShip();
		} else if (newShipType.equals("R")) {
			return new RocketEnemyShip();
		} else if (newShipType.equals("B")) {
			return new BigUfoAnemyShip();
		}
		else return null;
	}

}
