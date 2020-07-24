package solving.problem.java.c;

import java.util.Scanner;

public class N3663 {
	void execute() {
		Scanner s = new Scanner(System.in);
		String str;
		int num = s.nextInt();
		int sum = 0, count = 0, min = 0, len = 0, temp=0;
		int flag = -1;
		
		for(int i=0; i<num; i++) {
			str = s.next();
			sum = 0;
			count = 0;
			len = str.length();
			min = len-1;
			flag = -1;
			
			for(int j=0; j< len; j++) {
				sum += Math.min(str.charAt(j) - 'A', 26 - (str.charAt(j) - 'A'));
				
				if(str.charAt(j) == 'A' && flag == -1) { //처음 A가 나왔을때
					flag = j;
					count++;
				}else if(str.charAt(j) == 'A') { //A가 반복될
					count++;
				}else if(flag == 0) { //앞 AA
					min = Math.min(min, (len-count));
					flag = -1;
					count = 0;
				}
				else if(flag != -1) { //A부분이 끝났을때!!
					min = Math.min(min, (len-count-1 + Math.min(len - j, flag -1)));
					flag = -1;
					count = 0;
				}
			}
			
			if(flag != -1 && sum != 0) { //맨 마지막 AA
				min = Math.min(min, flag-1);
			}else if(sum == 0) {
				min = 0;
			}
			sum += min;
			
			System.out.println(sum);
		}
		s.close();
	}
}
