package solving.problem.java.i;

public class countAndSay {
	public String execute(int n) {
		String s1 = "1";
		int count=1;
		char fs;
		if(n == 0) return "";
		for(int i =1; i<n; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < s1.length(); j ++) {
				fs = s1.charAt(j);
				count = 1;
				while (j < s1.length() - 1 && s1.charAt(j + 1) == fs) {
	                count ++;
	                j ++;
	            }
				sb.append(count).append(fs);
			}
			s1 = sb.toString();
		}
		return s1;
    }
}
