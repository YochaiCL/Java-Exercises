
public class Ex_7_Book {

	private String name;
	private String autor;
	private int year;
	private int copies;
	private double price;
	private boolean bestSeller;

	public boolean sell(int num) {

		if (this.copies > num) {

			this.copies = this.copies - num;
			return true;
		}

		return false;
	}

	public void updatePrice() {

		if (this.year < 2010)

			if (this.copies > 100)

				if (bestSeller == false)

					this.price = this.price * 0.5;

	}
	
	public int getCopies() {
		
		return this.copies;
	}
	


}
