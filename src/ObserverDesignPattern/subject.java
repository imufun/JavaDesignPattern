package ObserverDesignPattern;

public interface subject {

	public void register(Observer o);

	public void unregister(Observer o);

	public void notifyObserver();
}
