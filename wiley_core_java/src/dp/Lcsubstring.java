package dp;

public class Lcsubstring {
	 public static int findLCS(String s1, String s2) {
	        int m = s1.length();
	        int n = s2.length();
	        int c=0;
	        int[][] dp = new int[m+1][n+1];
	        
	        for (int i = 1; i <= m; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (s1.charAt(i-1) == s2.charAt(j-1)) {
	                    dp[i][j] = (dp[i-1][j-1] + 1);
	                    c=Math.max(dp[i][j], c);
	                } else {
	                    dp[i][j] = 0;
	                }
	            }
	        }
	        
	        return c;
	    }

	    public static void main(String[] args) {
	        String s1 = "ABCDHG";
	        String s2 = "ACDFEF";
	        int lcs = findLCS(s1, s2);
	        System.out.println("Length of LCSubstring is " + lcs);
	    }
}
