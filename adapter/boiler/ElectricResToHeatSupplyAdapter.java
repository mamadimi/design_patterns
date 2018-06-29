package boiler;

public class ElectricResToHeatSupplyAdapter implements HeatSupply {

	ElectricResistance res;

	ElectricResToHeatSupplyAdapter(ElectricResistance res) {

		this.res = res;
	}

	@Override
	public void provideHeat() {
		// TODO Auto-generated method stub
		System.out.println("resistance Adapter");
		res.circuitOn();

	}

}
