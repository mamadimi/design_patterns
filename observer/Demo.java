import java.util.Observer;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temperature = 0;
		
		CelsiousDisplay celsiousDisp = new CelsiousDisplay(temperature);
		
		celsiousDisp.display();
		
		KelvinDisplay kelvinDisp = new KelvinDisplay(temperature);
		
		kelvinDisp.display();
		
		Thermometer thermometer = new Thermometer();
		thermometer.printTemmperature();
		
		thermometer.addObserver(celsiousDisp);
		thermometer.addObserver(kelvinDisp);
		
		thermometer.changeTemperature(1);
		thermometer.printTemmperature();
		
		celsiousDisp.display();
		kelvinDisp.display();
		
		thermometer.deleteObserver(kelvinDisp);
		
		thermometer.changeTemperature(10);
		thermometer.printTemmperature();
		
		celsiousDisp.display();
		kelvinDisp.display();

	}

}
