public class CeilingFanOnCommand implements Command {

	CeilingFan ceilingFan;
	
	CeilingFanOnCommand(CeilingFan ceilingFan){
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ceilingFan.ceilingFanOn();
	}

}
