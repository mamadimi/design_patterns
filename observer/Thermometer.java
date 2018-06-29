import java.util.Observable;

public class Thermometer extends Observable {
	
	int temperature;
	
	public Thermometer() {
		// TODO Auto-generated constructor stub
		 temperature = 0;
	}
	
	void changeTemperature(int temperature) {
		this.temperature = temperature;
		this.setChanged();
		this.notifyObservers(this);
	}
	
	int getTemperature() {
		return temperature;
	}
	
	void printTemmperature() {
		System.out.println("Thermometer temperature is " + temperature);
	}
}
