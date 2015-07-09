
public class BallotUnit {
	// status of the ballot power lamp
	private Boolean Onstatus;
	
	Lamp readyLamp = new ReadyLamp();
	Lamp candidateLamp = new CandidateLamp();
	Button candidateButton = new CandidateButton();
	
	// Ballot constructor
	public BallotUnit(){
		Onstatus = true;
	}
	
	// getter method for status
	public Boolean getStatus() {
		return Onstatus;
	}
	
	// setter method for status
	public void setStatus(Boolean status) {
		this.Onstatus = status;
	}
	
	
}
