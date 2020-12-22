package yaeman;

public class Person {
	public static int brain = 0;
	private int heart;
	private int pancrease;
	private int stomach;
	
	public boolean isHealth() {
		if(brain>0 && heart>0 && pancrease>0 && stomach>0) {
			return true;
		}
		return false;
	}
}
