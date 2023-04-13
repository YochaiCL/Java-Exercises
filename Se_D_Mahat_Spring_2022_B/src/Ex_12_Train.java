
public class Ex_12_Train {

	private String code; // number of the train
	private Ex_12_Time start; // time of exit
	private String[] staitions;
	private int[] k;

	public boolean isPossible(String station1, String station2) {

		int index1 = 0;
		int index2 = 0;

		for (int i = 0; i < this.staitions.length; i++) {
			if (this.staitions[i].equals(station1))
				index1 = i;

			if (this.staitions[i].equals(station2))
				index2 = i;
		}

		if (index1 < index2)
			return true;

		else
			return false;

	}
	
//	public Ex_12_Time GetArrivalTime(String station) {
//		
//		int index=-1;
//		
//		
//		for (int i=0;i<this.staitions.length;i++) {
//			if (this.staitions[i].equals(station))
//				index=i;
//		}
//		
//		if (index==-1)
//			return null;
//		
//		else {
//			if (index==0)
//				return ;
//			
//		}
//		
//	}

}
