package ObserverDesignPattern;

public class GrabStocks {

	public static void main(String[] a) {

		StackGrabber stackgraber = new StackGrabber();

		StackObserver observer1 = new StackObserver(stackgraber);

		stackgraber.setIBMPrice(100.1);
		stackgraber.setApplePrice(200.22);
		stackgraber.setGoolePrice(330.2);

		StackObserver observer2 = new StackObserver(stackgraber);

		stackgraber.setIBMPrice(100.1);
		stackgraber.setApplePrice(200.22);
		stackgraber.setGoolePrice(330.2);
		
		stackgraber.unregister(observer1);
		
		
		 //Runnable getIBM=new GetTheStock(stockGrabber, 2, 10, 100.0);
	}
}
