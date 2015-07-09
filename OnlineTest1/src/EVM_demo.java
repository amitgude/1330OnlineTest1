public class EVM_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControlUnit controlUnit = new ControlUnit();
		Candidate candidate1 = new Candidate("Person1");
		Candidate candidate2 = new Candidate("Person2");
		Candidate candidate3 = new Candidate("Person2");
		
		
		controlUnit.addCandidate(candidate1);
		controlUnit.addCandidate(candidate2);
		controlUnit.addCandidate(candidate3);
		controlUnit.getCandidates();
		
	}

}
