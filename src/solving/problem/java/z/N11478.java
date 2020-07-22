package solving.problem.java.z;

import java.util.HashSet;
import java.util.Scanner;

public class N11478 {
	void execute() {
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		HashSet<String> hs = new HashSet<String>();
		
		for(int i=0; i<str.length();i++) {
			for(int j=i; j<str.length();j++) {
				hs.add(str.substring(i, j+1));
			}
		}
		System.out.println(hs.size());
	}
}
