
public class Car extends Vehicle {
	
	boolean autoPilot;

	public Car(String manufactor, String model, int manufYear, boolean autoPilot) {
		super(manufactor, model, manufYear);
		this.autoPilot = autoPilot;
		// TODO Auto-generated constructor stub
	}

	@Override
	void printVehicle() {
		// TODO Auto-generated method stub
		System.out.println(this.manufactor + " " + this.model + " " + this.manufYear + " autopilot : " + " " + this.autoPilot);
		
	}

}
