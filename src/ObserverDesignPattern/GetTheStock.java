package ObserverDesignPattern;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

	private int startTime;
	private String stock;
	private double price;

	private subject stockGrabber;

	public GetTheStock(subject stockGrabber, int newStartTime, String newStock, double newPrice) {
		this.stockGrabber = stockGrabber;
		startTime = newStartTime;
		stock = newStock;
		price = newPrice;

	}

	@Override
	public void run() {
		for(int i=1;i<=20; i++){
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				double randNum = (Math.random()*(0.6))-0.3;
				DecimalFormat df=new DecimalFormat("#.##");
				price=Double.valueOf(df.format(price+randNum));
				if (stock=="IBM") ((StackGrabber) stockGrabber).setIBMPrice(price);
				if (stock=="APPLE") ((StackGrabber) stockGrabber).setApplePrice(price);
				if (stock=="GOOGLE") ((StackGrabber) stockGrabber).setGoolePrice(price);
				
				System.out.println(stock + ":" + df.format((price+randNum))+""+df.format(randNum));
				System.out.println();
				System.out.println();
				
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
