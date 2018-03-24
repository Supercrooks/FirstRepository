package ganZeJun5120162978;

import java.util.Scanner;

public class ZhuanHuan15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("ÊäÈë×Ö·û´®:");
		String st=sc.next();
		char[] ch=st.toCharArray();
		StringBuffer sbf=new StringBuffer();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]<=122 && ch[i]>=97) {
				ch[i] -=32;
				sbf.append(ch[i]);
			}
			else {
				ch[i] +=32;
			    sbf.append(ch[i]);
			}
		}
		System.out.println(sbf.toString());;
	}

}
