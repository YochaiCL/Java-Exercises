import unit4.bucketLib.Bucket;
public class Ex_1_c {

	public static void main(String[] args) {
		
		Bucket  b1 = new Bucket ((int)(Math.random()*10-1+1)+1, "one");
		Bucket  b2 = new Bucket ((int)(Math.random()*10-1+1)+1, "two");
		Bucket  b3 = new Bucket ((int)(Math.random()*10-1+1)+1, "three");
		
		b1.fill((Math.random()*b1.getCapacity()+1));
		b2.fill((Math.random()*b2.getCapacity()+1));
		b3.fill((Math.random()*b3.getCapacity()+1));
		
		double min,max,mid;
		
		if (b1.getCurrentAmount()>b2.getCurrentAmount()) {
			max=b1.getCurrentAmount();
			min=b2.getCurrentAmount();}
		
		else {
			max=b2.getCurrentAmount();
			min=b1.getCurrentAmount();
		}
		
		if (b3.getCurrentAmount()>max)
			max=b3.getCurrentAmount();
		
		else if (b3.getCurrentAmount()<min)
			min=b3.getCurrentAmount();
		
		mid=(b1.getCurrentAmount()+b2.getCurrentAmount()+b3.getCurrentAmount()-(min+max));

		System.out.println("b1Capacity="+b1.getCapacity()+" b1="+b1.getCurrentAmount());
		System.out.println("b2Capacity="+b2.getCapacity()+" b2="+b2.getCurrentAmount());
		System.out.println("b3Capacity="+b3.getCapacity()+" b3="+b3.getCurrentAmount());
		
		System.out.println("min="+min+" mid="+mid+" max="+max);
	}

}
