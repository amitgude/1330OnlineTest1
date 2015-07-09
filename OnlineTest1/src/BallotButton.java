
public class BallotButton implements Button {
   
	private boolean clickStatus = false;
	@Override
	public Boolean click() {
		// TODO Auto-generated method stub
		clickStatus = true;
		return true;
	}

}
