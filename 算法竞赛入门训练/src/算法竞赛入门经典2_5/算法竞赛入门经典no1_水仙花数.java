package �㷨�������ž���2_5;

public class �㷨�������ž���no1_ˮ�ɻ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i < 999; i++) {
			int a=i/100;
			int b=(i/10)%10;
			int c=i%10;
			if((a*a*a+b*b*b+c*c*c)==i){ // �� ��Math.pow(a,3)
				System.out.println(i);	
			}
				
			
		}
	}

}
