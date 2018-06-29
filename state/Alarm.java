
public class Alarm {
	
	State ALARMED;
	State DISALARMED;
	State BREAK_IN;
	State SILENCE_ALARM;
	
	State state;

	public Alarm() {
		// TODO Auto-generated constructor stub
		
		ALARMED = new AlarmedState(this);
		DISALARMED = new DisalarmedState(this);
		BREAK_IN = new BreakinState(this);
		SILENCE_ALARM = new SilenceAlarmState(this);
		
		state = DISALARMED;
	}
	
	void pressEnableAlarm() {
		state.enableAlarm();
	}
	
	void pressDisableAlarm() {
		state.disableAlarm();
	}
	
	void breakIn() {
		state.breakIn();
	}
	
	void silenceAlarm() {
		state.silenceAlarm();
	}
	
	void setState(State state) {
		
		this.state = state;
		
	}
	
	State getAlarmedState() {
		return this.ALARMED;
	}
	
	State getDisalarmedSate() {
		return this.DISALARMED;
	}
	
	State getBreakInState() {
		return this.BREAK_IN;
	}
	
	State getSilenceState() {
		return this.SILENCE_ALARM;
	}
	void printState() {
		System.out.println(state.getClass());
	}

}
