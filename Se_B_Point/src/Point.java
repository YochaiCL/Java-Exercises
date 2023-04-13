
public class Point {

	private double x,y;
	
	public Point (double x, double y) {
		
		this.x=x;
		this.y=y;
	}
	
	public double getx() {
		
		return this.x;
	}
	
	public void setx(double x) {
		
		this.x=x;
	}
	
	public double gety() {
		
		return this.y;
	}
	
	public void sety (double y) {
		
		this.y=y;
	}
	
	public String toString() {
		
		return "("+this.x+","+this.y+")";
	}
	
	//*****************************************//
	
	//מרחק מהנקודה הנוכחית
	
	public double distance(Point p) {
		
		return Math.sqrt(Math.pow(this.x-p.x, 2)+ Math.pow(this.y-p.y,2));
	}
	
	public Point middle(Point p) {
		
		double x,y;
		
		x=(this.x+p.x)/2;
		y=(this.y+p.y)/2;
		
		Point p2=new Point(x,y);
		
		return p2;//מחזיר נקודה חדשה
		
	}
		
	//*****************************************//

}
