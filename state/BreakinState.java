
public class BreakinState implements State {
	
	Alarm alarm;
	
	public BreakinState(Alarm alarm) {
		// TODO Auto-generated constructor stub
		this.alarm = alarm;
	}

	@Override
	public void enableAlarm() {
		// TODO Auto-generated method stub
		System.out.println("ALARMED");
		alarm.setState(alarm.getAlarmedState());
	}

	@Override
	public void disableAlarm() {
		// TODO Auto-generated method stub
		System.out.println("DISALARMED");		
	}

	@Override
	public void breakIn() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void silenceAlarm() {
		// TODO Auto-generated method stub
		
	}

}
