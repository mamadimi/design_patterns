import java.util.Observable;
import java.util.Observer;

public class KelvinDisplay implements Display, Observer {
	
	int temperature;
	
	public KelvinDisplay(int temperature) {
		// TODO Auto-generated constructor stub
		this.temperature = 273 + temperature;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Kelvin tempeature is " + temperature);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof Thermometer) {
			this.temperature = ((Thermometer) arg).getTemperature() + 273;
		}
	}

}
