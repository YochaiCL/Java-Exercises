
public class Ex_7_Truck_Test {

	public static void printTruckNames(Ex_7_Truck[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i].getIsfree() == true && arr[i].getNumStorage() >= 7)
				System.out.println(arr[i].getDriverName());
		}
	}

	public static String id(Ex_7_Truck[] arr) {

		int max = arr[0].getNumStorage();

		int index = 0;

		for (int i = 1; i < arr.length; i++)

			if (arr[i].getNumStorage() > max) {

				max = arr[i].getNumStorage();
				index = i;
			}
		
		if (arr[index].getIsfree()==true)
			return arr[index].getTrunkId();
		
		return "Unable to service";

	}

	public static void main(String[] args) {

		Ex_7_Truck[] arr = new Ex_7_Truck[5];

	}

}
