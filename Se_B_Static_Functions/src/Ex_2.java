
public class Ex_2 {
	public static int max(int num1, int num2) {//������ ������ 
		if(num1>num2)//����� 
			return num1;//����� ��� ����
		return num2;//����� ��� ����
	}
	
	public static int min (int num3, int num4) {
		if(num3>num4)
			return num3;
		return num4;
	}
	
	public static int max3Numbers(int x, int y, int z) {
		return max(x,max(y,z));
	}

	public static void main(String[] args) {
		
	}

}
