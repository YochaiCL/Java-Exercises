
public class Ex_2 {
	
	public static int check(int [] arr, int num) {
		
		for (int i=0;i<arr.length;i++) {
			
			if (num==arr[i])
				
				return i;
		}
		
		return -1;
	}
	
	// 90����� ������ ������ �� ��� ���� ����� �� ����� ���� ���� 50 ��� ������� 10-10000

	public static void main(String[] args) {
		
		int [] arr= {5,2,3,6};
		
		int num=6;
		
		System.out.println(check(arr, num));
		
		

	}

}
