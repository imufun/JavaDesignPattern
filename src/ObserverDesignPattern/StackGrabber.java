package ObserverDesignPattern;

import java.util.ArrayList;

public class StackGrabber implements subject {

	private ArrayList<Observer> Observer;

	private double ibmPrice;
	private double applePrice;
	private double googlePrice;

	public StackGrabber() {
		Observer = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer newObserver) {
		Observer.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex = Observer.indexOf(deleteObserver);
		System.out.println(" Observer " + (observerIndex + 1) + "Delete");
		Observer.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : Observer) { //
			observer.update(ibmPrice, applePrice, googlePrice);
		}
	}

	public void setIBMPrice(double newIbmPrice) {

		this.ibmPrice = newIbmPrice;
		notifyObserver();
	}

	public void setApplePrice(double newApplePrice) {

		this.applePrice = newApplePrice;
		notifyObserver();
	}

	public void setGoolePrice(double newGooglePrice) {

		this.googlePrice = newGooglePrice;
		notifyObserver();
	}

}
