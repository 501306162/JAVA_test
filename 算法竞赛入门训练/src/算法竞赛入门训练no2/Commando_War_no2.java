package 算法竞赛入门训练no2;

import java.util.Arrays;
import java.util.Scanner;

public class Commando_War_no2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int num=1;
		while (in.hasNext()){
			int N=in.nextInt();
			if(N==0) break;
			Subordinate []Sub=new Subordinate[N];
			for (int i=0;i<N ;i++) {
				Sub[i]=new Subordinate(in.nextInt(), in.nextInt());
			}
			Arrays.sort(Sub,new myCompare());  // Large to small
//			System.out.println("======after sorting=======");
//			for (Subordinate sub : Sub) {
//				System.out.println(sub.B+"  "+sub.J);
//			}
			int SumofTime=0;
			int temp=0;
			for(int k =0;k<N;k++){
				temp=temp+Sub[k].B;
				SumofTime=Math.max(temp+Sub[k].J,SumofTime);
			}
			System.out.println("case "+num+": "+SumofTime);
			num++;
		}
	}

}

