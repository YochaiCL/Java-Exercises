package Buses;

import java.util.Arrays;

public class Menegment {
	private String name;
	private final int MAXSIZE=100;
	private Bus [] buses;
	private int numOfBuses=0;
	
	
	public Menegment(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bus[] getBuses() {
		return buses;
	}
	public void setBuses(Bus[] buses) {
		this.buses = buses;
	}
	public int getMAXSIZE() {
		return MAXSIZE;
	}
	public int getNumOfBuses() {
		return numOfBuses;
	}
	@Override
	public String toString() {
		return "Menegment [name=" + name + ", MAXSIZE=" + MAXSIZE + ", buses=" + Arrays.toString(buses)
				+ ", numOfBuses=" + numOfBuses + "]";
	}
	
	public void addBuses (Bus b) {
		
		if (this.numOfBuses<this.MAXSIZE)
			this.buses[numOfBuses]=b;
	}
	
	public void delBuses(Bus b) {
		
		
	}
	
	
	

}
