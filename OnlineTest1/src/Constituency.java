import java.util.ArrayList;

public class Constituency {
	
	String Name;
	private ArrayList<Candidate> candidates;
	
	
	Constituency(String Name){
		this.Name=Name;
		candidates = new ArrayList<Candidate>();
	}
	
	String getConstituency(){
		return Name;
	}
	
	public void getCandidates(){
		for(int i=0;i<candidates.size();i++){
			System.out.println(candidates.get(i).getName());
		}
	}
	
	public void addCandidate(Candidate c){
		candidates.add(c);	
		}
}
