package solving.problem.java.z;

import java.util.Scanner;

public class N8958 {
	
	void execute(){
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String[] s = new String[num+1];
		
		for(int i=0; i<num; i++) {
			int count = 1, sum = 0;
			s[i] = sc.next();
			
			for(int j=0; j<s[i].length(); j++) {
				if(s[i].charAt(j) =='O') {
					sum += count;
					count++;
				}else {
					count = 1;
				}
				
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
