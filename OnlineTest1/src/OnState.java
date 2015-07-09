
public class OnState implements State {

	@Override
	public Boolean doAction(Context context) {
		// TODO Auto-generated method stub
		context.setState(this);
		return true;
	}

}
