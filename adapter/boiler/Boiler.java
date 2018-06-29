package boiler;

public class Boiler {

	HeatSupply powerSupply;

	Boiler(HeatSupply powerSupply) {
		this.powerSupply = powerSupply;
	}

	public void hotWater() {
		System.out.println("Start boiling the water");
		powerSupply.provideHeat();
	}

}
