public class cotton extends ClothesWashing {
	
	cotton(int temperature, int dryTemperature){
		super("cotton", temperature, dryTemperature);
	}

	@Override
	public void dry() {
		// TODO Auto-generated method stub
		System.out.println("Washing machine rotates at 2000 rpm ");
		
	}
	
	public boolean needsPrewash(){
		return true;
	}

}
