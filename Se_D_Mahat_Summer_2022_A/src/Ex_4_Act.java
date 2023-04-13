
public class Ex_4_Act {

	private String actName;
	private int len;
	private int currentNum;
	Ex_4_Actor[] actArr;

	public Ex_4_Act(String actName, int len) {

		this.actName = actName;

		this.len = len;

		actArr = new Ex_4_Actor[20];
	}

	public String check(Ex_4_Actor player) {
		
		String str="";

		if (player.getAge() >= 45 && player.getNumAct()>=5) {
			
			if (currentNum<actArr.length) {
				actArr[currentNum] = new Ex_4_Actor(player.getName(), player.getAge(), player.getNumAct());

				currentNum++;
				
				return str+="was added";
			}
			
			else
				return str+="no room";
		}
		return str+="not suitable";
	}
	
//	public int Exp () {
//		
//		int countExp=0;
//		
//		for (int i=0; actArr.length;i++) {
//			if(actArr[i].getNumAct()>=10)
//				countExp++;
//		}
//	}

}
