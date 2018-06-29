import java.util.Observable;
import java.util.Observer;

public class CelsiousDisplay implements Observer, Display {
	
	int temperature;

	public CelsiousDisplay(int temperature) {
		// TODO Auto-generated constructor stub
		
		this.temperature = temperature;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("Celsious tempeature is " + temperature);

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		if (arg1 instanceof Thermometer) {
			this.temperature = ((Thermometer) arg1).getTemperature();
		}
	}

}
