
public class ControlUnit {

	Button ballotButton = new BallotButton();
	Button totalButton = new TotalButton();
	Lamp onLamp = new OnLamp();
	Lamp busyLamp = new OnLamp();
	
	private boolean onStatus;
	
	
	public ControlUnit(){
		this.onStatus = true;
	}
	
	public void powerOnLamp(){
		
		if (this.onStatus == true){
			
		}
	}
	
	public void clickBallotButton(){
		
	}
	
	
}
