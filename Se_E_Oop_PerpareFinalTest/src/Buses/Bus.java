package Buses;

public class Bus {
	
	private int id;
	private int seats;
	 
	public Bus(int id, int seats) {
		super();
		this.id = id;
		this.seats = seats;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Bus [id=" + id + ", seats=" + seats + "]";
	}
	
	

}
