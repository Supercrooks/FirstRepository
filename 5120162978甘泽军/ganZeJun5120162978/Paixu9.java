package ganZeJun5120162978;

import java.util.Arrays;
import java.util.Scanner;

public class Paixu9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int m=sc.nextInt();
			int[] array=new int[m];
			for(int i=0;i<m;i++) {
				array[i]=sc.nextInt();
			}
			for(int i=0;i<array.length;i++)
				for(int j=i;j<array.length;j++)
					if(array[i]>array[j]) {
						int t=array[i];
						array[i]=array[j];
						array[j]=t;
					}
			System.out.println("最大值为:"+array[array.length-1]+"最小值为:"+array[0]);
			System.out.println("从小到大排序为："+Arrays.toString(array));
		}
	}

}
