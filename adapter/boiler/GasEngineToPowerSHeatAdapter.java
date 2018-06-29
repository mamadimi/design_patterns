package boiler;

public class GasEngineToPowerSHeatAdapter implements HeatSupply {

	GasEngine gasEngine;

	GasEngineToPowerSHeatAdapter(GasEngine gasEngine) {

		this.gasEngine = gasEngine;
	}

	@Override
	public void provideHeat() {
		// TODO Auto-generated method stub
		System.out.println("gas Adapter");
		gasEngine.burnGas();

	}

}
