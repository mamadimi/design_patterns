public class Light {
	
	String location;
	boolean state;
	
	Light(String location){
		this.location = location;
		this.state = false;
		System.out.println("lights at " + this.location + " are initialized");
	}
	
	public void lightsOn(){
		this.state = true;
		System.out.println("Lights are " + this.state);
	}
	
	public void lightsOff(){
		this.state = false;
		System.out.println("Lights are " + this.state);
	}
}
