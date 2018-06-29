
public class GarageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("mitsubishi", "lancer", 2004, false);
		
		Car car2 = new Car("ford", "fiesta", 2008, false);
		
		Bike bike1 = new Bike("suzuki", "hyd", 2010, true);
		
		Garage garage = new Garage();
		
		garage.addVehicle(car1);
		garage.addVehicle(car2);
		garage.addVehicle(bike1);
		
		garage.printGarageVehicles();

	}

}
