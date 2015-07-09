
public class ControlUnit {

	Button ballotButton = new BallotButton();
	Button totalButton = new TotalButton();
	Lamp onLamp = new OnLamp();
	Lamp busyLamp = new BusyLamp();
	Constituency con = new Constituency("Ponda");
	private boolean onStatus;
	
	
	public ControlUnit(){
		this.onStatus = true;
	}
	
	public void powerOnLamp(){
		
		if (this.onStatus == true){
			onLamp.lighton();
		}
		else{
			onLamp.lightoff();
		}
	}
	
	public void clickBallotButton(){
		
		if (ballotButton.click()){
			
		}
	}

	
	
	
	public void addCandidate(Candidate c){
		con.addCandidate(c);
	}

	public void getCandidates() {
		// TODO Auto-generated method stub
		con.getCandidates();
	}
	
	
}
