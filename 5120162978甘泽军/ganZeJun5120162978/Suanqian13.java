package ganZeJun5120162978;

import java.util.Scanner;

public class Suanqian13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double db = sc.nextDouble();
		final double a= 0.065;
		int t=0;
		double sum=0;
		double[] db1 = new double[120];
		double[] db2 = new double[10];//��Ϣ
		double[] db3 = new double[10];
		db1[0]=db;
		for(int i=1;i<120;i++) {
			db1[i]=(1+a/12)*db1[i-1];		
		}
		for(int i=0;i<10;i++) {
			for(int j=t;j<120;j++) {
				if((j+1)%12==0) {
				  db2[i]+=db1[j];
				 break;				 
				}					
		   }
			t=12*(i+1);
	   System.out.print("��"+(i+1)+"�����Ϊ:"+db2[i]);	
		}
		System.out.println();
		System.out.print("��1����ϢΪ:"+(db2[0]-db));
		for(int i=1;i<10;i++) {
			db3[i]=db2[i]-db2[i-1];
			System.out.print("��"+(i+1)+"����ϢΪ:"+db3[i]);
		}
		System.out.println();
		for(int i=1;i<10;i++) {
		sum += db3[i];
		}
		System.out.print("ƽ����ϢΪ:"+sum/10);
	}
}
