package observerPatterns;

import java.util.ArrayList;

public class WhetherData implements Subject{
	
	private ArrayList<Observer> observers;
	private float pressure;
	private float temp;
	private float hum;
	
	public WhetherData(){
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		for(Observer b : observers){
			b.update(temp, hum, pressure);
		}
		
	}
	
	public void setMeasurment(float temp, float hum, float pressure){
		this.temp = temp;
		this.hum = hum;
		this.pressure = pressure;
		notifyObserver();
	}
	
	public float getPressure() {
		return pressure;
	}

	public float getTemp() {
		return temp;
	}

	public float getHum() {
		return hum;
	}

}
