package solving.problem.java.z;

import java.util.Scanner;

public class N10757 {
	void execute(){
		Scanner s = new Scanner(System.in);
		int num,sum,limit;
		int flag = 0;
		int[] result;
		
		String a = s.next();
		String b = s.next();
		
		String[] aNum = a.split("");
		String[] bNum = b.split("");
		int an = aNum.length;
		int bn = bNum.length;
		
		if(an > bn) {
			num =an;
			limit = bn;
			result = new int[an+1];
		}
		else {
			num = bn;
			limit = an;
			result = new int[bn+1];
		}
		
		for(int i = 0; i < num; i++) {
			if(i < limit) {
				sum = Integer.parseInt(aNum[--an])+Integer.parseInt(bNum[--bn]) + flag;
			}else if(an > bn){
				sum = Integer.parseInt(aNum[--an])+flag;
				flag = 0;
			}else {
				sum = Integer.parseInt(bNum[--bn])+flag;
				flag = 0;
			}
			if(sum >= 10) {
				result[i] = sum - 10;
				flag = 1;
			}else {
				result[i] = sum;
				flag = 0;
			}
		}
		if(flag == 1) {
			System.out.print(1);
		}
		for(int i = num-1; i >=0; i--) {
			System.out.print(result[i]);
		}
		
		s.close();
	}
}
