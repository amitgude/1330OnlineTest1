public class Candidate {
	String Name;
	int votes=0;
	
	
	Candidate(String name){
		this.Name=name;
	}
	
	public void addVote(){
		this.votes=votes++;
	}
	
	int getVotes(){
		return votes;
	}
	
	String getName(){
		return Name;
	}

}
