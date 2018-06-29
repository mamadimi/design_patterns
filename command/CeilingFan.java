public class CeilingFan {
	String location;
	boolean state;
	
	CeilingFan(String location){
		this.location = location;
		this.state = false;
		
		System.out.println("celing at " + this.location + " is initialized");
	}
	
	public void ceilingFanOn(){
		this.state = true;
		System.out.println("Ceiling Fan is " + this.state);
	}
	
	public void ceilingFanOff(){
		System.out.println("Ceiling Fan is " + this.state);
	}
}
