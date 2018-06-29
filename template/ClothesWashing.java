public abstract class ClothesWashing {
	
	String type;
	int temperature;
	int dryTemperature;
	
	ClothesWashing(String type, int temperature, int dryTemperature){
		this.type = type;
		this.temperature = temperature;
		this.dryTemperature = dryTemperature;
	}
	
	public final void washing() {
		if (needsPrewash()) preWash();
		
		wash();
		
		dry();
	}
	
	public void preWash() {
		System.out.println("Start prewashing "+ this.type + " clothes");
	}
	
	public void wash() {
		System.out.println("Washing " + this.type + " clothes in " + this.temperature + " oC");
	}
	
	public abstract void dry();
	
	public boolean needsPrewash(){
		return false;
	}

}
