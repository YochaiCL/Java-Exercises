
public class Ex_7_Truck {

	private String trunkId;
	private String driverName;
	private int numStorage;
	private boolean isFree;

	public Ex_7_Truck(String tmpTrunkId, String tmpDriverName, int tmpNumStorage) {

		this.trunkId = tmpTrunkId;
		this.driverName = tmpDriverName;
		this.numStorage = tmpNumStorage;
		this.isFree = true;
	}

	public String getDriverName() {

		return this.driverName;
	}

	public int getNumStorage() {
		return numStorage;
	}

	public boolean getIsfree() {
		return this.isFree;
	}
	
	public String getTrunkId() {
		
		return this.trunkId;
	}

}
