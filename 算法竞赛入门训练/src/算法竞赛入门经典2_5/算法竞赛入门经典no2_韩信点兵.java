package 算法竞赛入门经典2_5;

import java.util.Scanner;

public class 算法竞赛入门经典no2_韩信点兵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int Case_num=0;
		while(in.hasNextInt()){
			int a=-1,b=-1,c=-1;
			Case_num++;
			do {				
				a=in.nextInt();
				b=in.nextInt();
				c=in.nextInt();
			} while (!((a>=0)&&(a<3)&&(b>=0)&&(b<5)&&(c>=0)&&(c<7)));
			int num=0;
			for (int i = 11; i <=100; i++) {
				if((i%3)==a&&(i%5==b)&&(i%7==c)){
					num=i;
					break;
				}
			}
			if((num>0))
				System.out.println("Case "+Case_num+":"+num);
			else
				System.out.println("Case "+Case_num+": no answer");

		}
	}

}
