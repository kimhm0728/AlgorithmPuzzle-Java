package quiz;

public class Q15 {
	static int N = 10; // 계단의 단 수
	static int steps = 4; // 한 번에 이동할 수 있는 단 수
	static Integer[][] dp;
	public static void main(String[] args) {
		dp = new Integer[N+1][N+1];
		System.out.println(DP(0, N)); // a는 0에서, b는 N에서 시작
	}
	static int DP(int a, int b) {
		if(a > b) 
			return 0;
		else if(dp[a][b] != null)
			return dp[a][b];
		else if(a == b)
			return dp[a][b] = 1;
		else {
			dp[a][b] = 0;
			for(int i=1;i<=steps;i++)
				for(int j=1;j<=steps;j++) 
					dp[a][b] += DP(a+i, b-j);
		}
		return dp[a][b];
	}
}
