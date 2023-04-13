
public class Ex_5_Animal {
	
	private String name;
	private int age;
	private double weight;
	
	public Ex_5_Animal (String name, int age, double weight) {
		
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public void setName (String name) {
		
		this.name=name;
	}
	
	public int getAge() {
		
		return this.age;
	}
	
	public void setAge(int age) {
		
		this.age=age;
	}
	
	public double getWeight() {
		
		return this.weight;
	}
	
	public void setWeight (double weight) {
		
		this.weight=weight;
	}
		
	
	public String toString() {
		
		return "Name: "+this.name+" Age:"+this.age+" "+this.weight;
	}
	
	public String big_wieght (Ex_5_Animal a) {
		
		double x;
		
		x=this.weight-a.weight;
		
		if(x>0)
			return this.name;
		
		else 
			return a.name;
	}
	
	

}
