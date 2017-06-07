package 算法竞赛入门训练no1;

import java.util.Arrays;
import java.util.Scanner;

public class The_Dragon_of_Loowater_no1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		/* input the data
		 	m: number of knights
		 	n: number of dragon's heads
			knights:	knights' capability
			heads:		heads' diameter
		*/

		String []out=new String[2000];
		int count=0;
		while(in.hasNext()){			
			int n=in.nextInt();			
			int m=in.nextInt();
			if(m==0&&n==0) break;
			
			double [] heads=new double[n];
			for (int i = 0; i < heads.length; i++) {
				heads[i]=in.nextDouble();
			}
			double [] knights=new double[m];
			for (int i = 0; i < knights.length; i++) {
				knights[i]=in.nextDouble();
			}
			Arrays.sort(knights);
			Arrays.sort(heads);
			
			double []payment=hire(knights,heads);

			if(payment[0]==0.0||payment[1]<heads.length){
				out[count]="Loowater is doomed!";
			}else{
				out[count]=String.valueOf(payment[0]);				
			}	
			count++;
		}
		for (int k=0;k<out.length&&out[k]!=null;k++) {
			System.out.println(out[k]);			
		} 			
		

	}

	private static double[] hire(double[] knights, double[] heads) {
		// TODO Auto-generated method stub
		double payment=0;
		double count=0;
		int temp=0;
		for (double d : heads) {
			for (int q=0; q<knights.length;q++) {
				if(count==0){
					if(knights[q]>=d){
						
						temp=q;
						payment=payment+knights[q];	
						count++;
						break;
					}
				}else{	
					if(knights[q]>=d&&temp!=q){
						
						temp=q;
						payment=payment+knights[q];	
						count++;
						break;
					}
				}	
				
			}		

		}
		
		double[]p={payment,count}; 
		return p;

	}

}
