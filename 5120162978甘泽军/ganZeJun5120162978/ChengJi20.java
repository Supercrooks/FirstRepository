package ganZeJun5120162978;

import java.util.Scanner;

public class ChengJi20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String str[]=st.split(",");
		double[] db = new double[str.length];
		double aver=0,aver1=0,sum=0,sum1=0;
		for(int i=0;i<str.length;i++) {
			db[i]= Integer.parseInt(String.valueOf(str[i]));	
			sum +=db[i];
		}
		aver = sum/str.length;
		System.out.println("平均成绩:"+aver);
		for(int i=0;i<str.length;i++) {
			db[i]= Integer.parseInt(String.valueOf(str[i]));	
			 sum1 += Math.sqrt(((double)db[i] -aver) * ((double)db[i] -aver));
		}
		aver1 = sum1/str.length;
		System.out.println("标准方差:"+aver1);
	}

}
