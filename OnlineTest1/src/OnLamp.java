
public class OnLamp implements Lamp {

	Context context = new Context();
	 
	public Boolean lighton(){
		context.setState(new OnState());
		return true;
	}
	
	public Boolean lightoff(){
		context.setState(new OffState());
		return false;
	}

	

}	
