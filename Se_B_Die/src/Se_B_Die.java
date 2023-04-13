
public class Se_B_Die {

	private int num;
	
	public Se_B_Die() {
		
		this.num=(int)(Math.random()*6)+1;
	}
	
	public void roll() {
		
		this.num=(int)(Math.random()*6)+1;
	}
	
	public int getNum() {
		return this.num;
	}
	
}
