package Customer;

public class Customer {

	private String name;
	private int ticket;
	private int tel;

	public Customer(String tmpName, int tmpTicket, int tmpTel) {

		setName(tmpName);
		setTicket(tmpTicket);
		setTel(tmpTel);

	}

	public String getName() {
		return name;
	}

	public void setName(String tmpName) {
		this.name = tmpName;
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int tmpTicket) {
		this.ticket = tmpTicket;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tmpTel) {
		this.tel = tmpTel;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", ticket=" + ticket + ", tel=" + tel + "]";
	}

}
