public class TestRemote {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Receivers
		Light light = new Light("kitchen");
		CeilingFan CeilingFan = new CeilingFan("living room");
		
		//Invoker
		RemoteControlInvoker remote = new RemoteControlInvoker();
		
		//initialize commands
		
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(CeilingFan);
		
		remote.setCommand(lightOnCommand, 0);
		remote.setCommand(ceilingFanOnCommand, 1);
		
		remote.buttonPress(0);
		remote.buttonPress(1);

	}

}
