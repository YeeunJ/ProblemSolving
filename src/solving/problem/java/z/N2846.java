package solving.problem.java.z;

import java.util.Scanner;

public class N2846 {
	void execute() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int prev, cur, sep = 0, max = 0;
		prev = s.nextInt();
		
		for(int i =1; i<num; i++) {
			cur = s.nextInt();
			if(cur > prev) {
				sep += cur - prev;
			}else {
				sep = 0;
			}
			if(sep > max) {
				max = sep;
			}
			prev = cur;
		}
		
		System.out.println(max);
		
		s.close();
	}

}
