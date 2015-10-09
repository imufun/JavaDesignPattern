package ObserverDesignPattern;

import javax.security.auth.Subject;

public class StackObserver implements Observer {

	private double ibmPrice;
	private double applePrice;
	private double googlePrice;

	private static int observerIDtracker = 0;

	private int observerID;

	private subject stackgraber;

	public StackObserver(subject stackgraber) {

		this.stackgraber = stackgraber;
		this.observerID = ++observerIDtracker;

		System.out.println("New Observer " + this.observerID);
		stackgraber.register(this);

	}

	@Override
	public void update(double ibmPrice, double applePrice, double googlePrice) {

		this.ibmPrice = ibmPrice;
		this.applePrice = applePrice;
		this.googlePrice = googlePrice;

		PrintThePrice();
	}

	private void PrintThePrice() {

		System.out.println(observerID + " \nIBM " + ibmPrice + " \nApple " + applePrice + "\nGoogle " + googlePrice);

	}

}
