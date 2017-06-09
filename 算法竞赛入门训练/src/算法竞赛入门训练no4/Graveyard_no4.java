package 算法竞赛入门训练no4;

import java.util.Scanner;

public class Graveyard_no4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		while (in.hasNextInt()){
			int n=in.nextInt();
			int m=in.nextInt();
			double dis=0;
			for (int i=0;i<n;i++){
				double pos= ((double)i/n)*(n+m);
				dis+=Math.abs(pos-Math.round(pos))/(n+m);
			}
			System.out.printf("%.4f",dis*10000);
		}
		
		in.close();
	}

}
