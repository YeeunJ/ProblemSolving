package solving.problem.java.b;

import java.math.BigInteger;
import java.util.Scanner;

public class N6571 {
	 void execute() {
		 BigInteger a;
			BigInteger b;
			BigInteger f1 = new BigInteger("1");
			BigInteger f2= new BigInteger("2");
			BigInteger f3 = new BigInteger("3");
			int count = 0;
			Scanner s = new Scanner(System.in);
			do {
				f1= BigInteger.ONE;
				f2= BigInteger.valueOf(2);
				f3= BigInteger.valueOf(3);
				count=0;
				
				a= s.nextBigInteger();
				b= s.nextBigInteger();
				
				if(a.compareTo(BigInteger.valueOf(1)) <= 0 && b.compareTo(BigInteger.valueOf(1)) >= 0) {
					count++;
				}
				if(a.compareTo(BigInteger.valueOf(2)) <= 0 && b.compareTo(BigInteger.valueOf(2)) >= 0) {
					count++;
				}
				while(f3.compareTo(b)<= 0) {
					if(f3.compareTo(a) >= 0)	count++;
					f1= f2;
					f2 = f3;
					f3 = f1.add(f2);
				}
				
				if(a.compareTo(BigInteger.ZERO) != 0 || b.compareTo(BigInteger.ZERO) != 0)
					System.out.println(count);
			}while(a.compareTo(BigInteger.ZERO) != 0 || b.compareTo(BigInteger.ZERO) != 0);
			
			s.close();
	 }
}