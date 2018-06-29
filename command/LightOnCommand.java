public class LightOnCommand implements Command {
	
	Light light;
	
	LightOnCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.lightsOn();
	}

}
