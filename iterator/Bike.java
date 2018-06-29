
public class Bike extends Vehicle {
	
	boolean isMotocross;

	public Bike(String manufactor, String model, int manufYear, boolean isMotocross) {
		super(manufactor, model, manufYear);
		// TODO Auto-generated constructor stub
		this.isMotocross = isMotocross;
	}

	@Override
	void printVehicle() {
		System.out.println(this.manufactor + " " + this.model + " " + this.manufYear + " Motocross : " + " " + this.isMotocross);
		
	}

}
