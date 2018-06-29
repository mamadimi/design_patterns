import java.util.ArrayList;
import java.util.Iterator;

public class Garage {
	
	ArrayList<Vehicle> vehicles;

	public Garage() {
		// TODO Auto-generated constructor stub
		vehicles = new ArrayList<Vehicle>();
	}
	
	void addVehicle(Vehicle veh) {
		vehicles.add(veh);
	}
	
	Iterator<Vehicle> createIterator() {
		return vehicles.iterator();
	}
	
	void printGarageVehicles() {
		Iterator<Vehicle> vehIter = createIterator();
		
		while( vehIter.hasNext() ) {
			Vehicle veh = (Vehicle)vehIter.next();
			veh.printVehicle();
		}
	}

}

