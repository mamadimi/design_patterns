package boiler;

public class BoilerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set the heat supply
		GasEngine gasEngine = new GasEngine("eng01");

		// Set the adapter

		GasEngineToPowerSHeatAdapter heatGasAdapter = new GasEngineToPowerSHeatAdapter(gasEngine);

		// Set the boiler
		Boiler boiler = new Boiler(heatGasAdapter);

		boiler.hotWater();

		// During cheaper electrical power

		// Set the electricResistance
		ElectricResistance eleRes = new ElectricResistance("res02");

		ElectricResToHeatSupplyAdapter heatResAdapter = new ElectricResToHeatSupplyAdapter(eleRes);
		Boiler boiler2 = new Boiler(heatResAdapter);

		boiler2.hotWater();

	}

}
