package FactoryDesignPattern;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] a) {
		EnemyShip theEnemy = null;
		EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

		Scanner userInput = new Scanner(System.in);

		System.out.print("What type of ship? (U / R / B)");

		if (userInput.hasNextLine()) {

			String typeOfShip = userInput.nextLine();

			theEnemy = enemyShipFactory.mekeEnemyShip(typeOfShip);

			if (theEnemy != null) {

				doStuffEnemy(theEnemy);

			} else
				System.out.print("Please enter U, R, or B next time");

		}

		// doStuffEnemy(enemyShip);
	}

	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
