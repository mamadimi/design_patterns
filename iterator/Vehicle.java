
public abstract class Vehicle {
	
	String manufactor,model;
	
	int manufYear;
	
	Vehicle(String manufactor, String model, int manufYear){
		this.manufactor = manufactor;
		this.model = model;
		this.manufYear = manufYear;
	}
	
	abstract void printVehicle();
}

