
public class AlarmedState implements State {
	
	Alarm alarm;

	public AlarmedState(Alarm alarm) {
		// TODO Auto-generated constructor stub
		this.alarm = alarm;
	}

	@Override
	public void enableAlarm() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();

	}

	@Override
	public void disableAlarm() {
		// TODO Auto-generated method stub
		System.out.println("DISALARMED");
		alarm.setState(alarm.getDisalarmedSate());

	}

	@Override
	public void breakIn() {
		// TODO Auto-generated method stub
		System.out.println("BREAK IN");
		alarm.setState(alarm.getBreakInState());

	}

	@Override
	public void silenceAlarm() {
		// TODO Auto-generated method stub
		System.out.println("SILENCE ALARM ENABLED");
		alarm.setState(alarm.getSilenceState());
	}

}
