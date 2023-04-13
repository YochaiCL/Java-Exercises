import unit4.bucketLib.Bucket;

public class Ex_1_b {

	public static void main(String[] args) {
		
		double max=0;
		
		Bucket  b1 = new Bucket (20, "one");
		Bucket  b2 = new Bucket (20, "two");
		Bucket  b3 = new Bucket (20, "three");
		
		b1.fill ((Math.random()*(20-0+1))+0);
		b2.fill ((Math.random()*(20-0+1))+0);
		b3.fill ((Math.random()*(20-0+1))+0);
		
		max=Math.max(b3.getCurrentAmount(), (Math.max(b1.getCurrentAmount(), b2.getCurrentAmount())));
		
		System.out.println(b1.getCurrentAmount());
		System.out.println(b2.getCurrentAmount());
		System.out.println(b3.getCurrentAmount());
		System.out.println(max);
		
		b1.fill(max-b1.getCurrentAmount());
		b2.fill(max-b2.getCurrentAmount());
		b3.fill(max-b3.getCurrentAmount());
	}

}
