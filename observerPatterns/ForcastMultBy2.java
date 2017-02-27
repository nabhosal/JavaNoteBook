package observerPatterns;

public class ForcastMultBy2 implements Observer{
	
	private Subject whetherdata;
	private float temp; 
	private float hum; 
	private float pressure;
	
	public ForcastMultBy2(Subject whetherdata){
		this.whetherdata = whetherdata;
		this.whetherdata.registerObserver(this);
	}
	
	
	@Override
	public void update(float temp, float hum, float pressure) {
		// TODO Auto-generated method stub
		this.temp = temp * 2;
		this.hum = hum * 2;
		this.pressure = pressure * 2;
		display();
	}


	private void display() {
		// TODO Auto-generated method stub
		System.out.println("ForcastMultByTwo "+temp+", "+hum+", "+pressure);
	}

}
