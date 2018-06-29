public class RemoteControlInvoker {
	/*
	 * The remote hasbuttons that do an action.
	 * */
	
	//Define command objects
	
	Command commands[];
	
	RemoteControlInvoker(){
		
		commands = new Command[2];
		for(int i=0;i<2;i++) {
			commands[i] = new NoCommand();
		}
	}
	
	public void setCommand(Command command,int slot) {
		this.commands[slot] = command;
		System.out.println("Commands are set");
	}
	
	public void buttonPress(int slot) {
		commands[slot].execute();
	}

}
