package 算法竞赛入门经典2_5;

public class 算法竞赛入门经典no1_水仙花数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i < 999; i++) {
			int a=i/100;
			int b=(i/10)%10;
			int c=i%10;
			if((a*a*a+b*b*b+c*c*c)==i){ // 或 用Math.pow(a,3)
				System.out.println(i);	
			}
				
			
		}
	}

}
