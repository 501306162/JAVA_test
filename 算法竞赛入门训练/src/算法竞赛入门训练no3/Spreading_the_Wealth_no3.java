package 算法竞赛入门训练no3;

import java.util.Arrays;
import java.util.Scanner;

public class Spreading_the_Wealth_no3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		while (in.hasNextInt()){
			int n=in.nextInt();
			
			long totalMoney=0; 
			long []money=new long [n];
			for (int i=0; i< money.length;i++) {
				money[i]=in.nextLong();
				totalMoney+=money[i];
			}
			long averMoney=totalMoney/n;
			
			long []c=new long[n];
			for (int i = 1; i < c.length; i++) {
				c[i]=money[i]-averMoney+c[i-1];
			}
			
			Arrays.sort(c);
			long x1=c[n/2];//the minimum distance point
			long totalMove=0; //the initial movements are zero
			
			for (long l : c) {
				totalMove+=+Math.abs(x1-l);
			}
			
			System.out.println("money shared: "+totalMove);
		}
		in.close();
	}

}
