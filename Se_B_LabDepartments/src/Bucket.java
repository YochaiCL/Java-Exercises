import unit4.bucketLib.Bucket;
public class Bucket {

	public static void main(String[] args) {
		
		Bucket b1, b2, b3, b4, b5, b6;
		
		  b1 = new Bucket (5, "one");
		  b2 = new Bucket (8, "two");
		  b3 = new Bucket (9, "three");
		  b4 = new Bucket (6, "four");
		  b5 = new Bucket (3, "five");
		  b6 = new Bucket (7, "six");
		
		b1.fill (b1.getCapacity());
		b2.fill(b1.getCurrentAmount()/2);
		b3.fill(b2.getCurrentAmount()/2);
		b4.fill(b3.getCurrentAmount()/2);
		b5.fill(b4.getCurrentAmount()/2);
		b6.fill(b5.getCurrentAmount()/2);
	}

}
